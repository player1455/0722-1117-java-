package org.example.springformysql.domain;


import lombok.Data;

@Data
public class articles {

    private int ArticleID;
    private String Title;
    private String Context;
    private String AuthorID;
    private String CategoryID;
    private String CreateAt;
    private String UpdateAt;

}
