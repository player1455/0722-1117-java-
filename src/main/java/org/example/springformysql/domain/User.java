package org.example.springformysql.domain;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.time.LocalDate;

@Data
public class User {

    private int UserID;
    private String UserName;
    @JsonIgnore
    private String PasswordHash;
    private String Email;
    private String nickname;
    private String user_pic;
    private LocalDate CreatedAt;
    private LocalDate update_time;



}
