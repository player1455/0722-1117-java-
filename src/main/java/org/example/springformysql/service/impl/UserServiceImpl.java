package org.example.springformysql.service.impl;

import org.example.springformysql.Mapper.UserMapper;
import org.example.springformysql.domain.User;
import org.example.springformysql.service.UserService;
import org.example.springformysql.util.Md5util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public User findByUserName(String username) {
        User u = userMapper.findByUserName(username) ;
        return u;
    }

    @Override
    public void register(String Username, String PasswordHash, String Email, String nickname, String user_pic, LocalDate CreatedAt) {
        String md5String = Md5util.getMD5String(PasswordHash) ;
        //添加
        userMapper.add(Username,md5String,Email,nickname,user_pic);
    }

    @Override
    public void update(User user) {
        userMapper.update(user) ;
    }

    @Override
    public void updateAvatar(String avatarUrl) {
        userMapper.updateAvatar(avatarUrl) ;
    }


}
