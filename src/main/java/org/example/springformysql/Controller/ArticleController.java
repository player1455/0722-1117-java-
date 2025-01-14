package org.example.springformysql.Controller;

import jakarta.servlet.http.HttpServletResponse;
import org.example.springformysql.domain.Result;
import org.example.springformysql.util.JwtUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpResponse;
import java.util.Map;

@RestController
@RequestMapping("/article")
public class ArticleController {

    @GetMapping("/list")
    public Result<String> list(/*@RequestHeader(name = "Authorization") String token , HttpServletResponse response*/) {
        //验证
        /*try {
            Map<String, Object> claims = JwtUtil.parseToken(token);
            return Result.success("文件数据....");
        } catch (Exception e) {
            response.setStatus(401);
            return Result.error("未登录");
        }*/
        return Result.success("文件数据....");
    }
}
