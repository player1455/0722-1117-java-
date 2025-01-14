package org.example.springformysql.Controller;


import jakarta.validation.constraints.Pattern;
import org.example.springformysql.domain.Result;
import org.example.springformysql.domain.User;
import org.example.springformysql.service.UserService;
import org.example.springformysql.util.JwtUtil;
import org.example.springformysql.util.Md5util;
import org.example.springformysql.util.ThreadLocalUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public Result register(String username,String password,String email ,String nickname, String user_pic, LocalDate CreatedAt ) {

        int total = email.length() ;
        if (username.length()>=5 && username.length()<=16 && password.length()>=5 && password.length()<=16
            && email.substring(total-4,total).equals(".com")) {
            User u = userService.findByUserName(username) ;
            if (u == null) {
                userService.register(username,password,email,nickname, user_pic,CreatedAt);
                return Result.success();
            }else {
                //占用
                return Result.error("用户名已被占用") ;
            }
        }else {
            return Result.error("你的输入不合法") ;
        }

    }


    @PostMapping("/login")
    public Result login(@Pattern(regexp = "^\\S{5,16}$") String username,@Pattern(regexp = "^\\S{5,16}$") String password) {
        User u = userService.findByUserName(username);
        if (u==null) {
            return Result.error("用户不存在");
        }
        String pass = Md5util.getMD5String(password) ;
        if (username.equals(u.getUserName())) {
            if (pass.equals(u.getPasswordHash())) {
                Map<String,Object> claim = new HashMap<>();
                claim.put("UserID",u.getUserID());
                claim.put("UserName",u.getUserName());
                String token = JwtUtil.genToken(claim) ;
                return Result.success(token);
            }

            return Result.error("密码无法匹配") ;
        }
        return Result.error("用户名错误") ;
    }


    @GetMapping("/userInfo")
    public Result<User> userInfo(@RequestHeader(name = "Authorization") String token) {
        Map<String,Object> map = JwtUtil.parseToken(token) ;
        String username = (String) map.get("UserName");
        User user = userService.findByUserName(username);
        return Result.success(user);
    }

    @PutMapping("/update")
    public Result updateUserInfo(@RequestBody User user) {
        Map<Object,String>  maps = ThreadLocalUtil.get();
        String username = maps.get("UserName");
        User u = userService.findByUserName(username);
        userService.update(user) ;
        return Result.success();
    }

    @PutMapping("/updateAvatar")
    public Result updateAvatar(@RequestParam String avatarUrl) {
        userService.updateAvatar(avatarUrl) ;
        return Result.success();
    }
}
