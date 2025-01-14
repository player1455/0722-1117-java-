package org.example.springformysql.Mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.example.springformysql.domain.User;

@Mapper
public interface UserMapper {
    //根据用户名查数据
    @Select("select * from users where Username = #{username}")
    User findByUserName(String username);

    @Insert("insert into users(Username,PasswordHash,CreatedAt,Email,nickname,user_pic)" +
            "values (#{Username},#{password},now(),#{email},#{nickname},#{user_pic} ) ")
    void add(String Username, String password, String email, String nickname, String user_pic);

    @Update("update users set nickname=#{nickname},Email=#{email} where UserID=#{UserID}")
    void update(User users);

    @Update("update users set user_pic=#{avayarUrl} where ")
    void updateAvatar(String avatarUrl);
}
