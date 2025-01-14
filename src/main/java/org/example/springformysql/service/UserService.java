package org.example.springformysql.service;

import org.example.springformysql.domain.User;

import java.time.LocalDate;

public interface UserService {
    //根据用户名查询用户
    User findByUserName(String username);
    //注册


    void register(String Username, String PasswordHash, String Email,String nickname, String user_pic, LocalDate CreatedAt);



    //更新
    void update(User user);

    void updateAvatar(String avatarUrl);
}
