create database if not exists Website ;

use Website ;

CREATE TABLE if not exists Users (
                       UserID INT AUTO_INCREMENT PRIMARY KEY,  -- 确保是 INT 类型
                       UserName VARCHAR(50) NOT NULL,
                       Email VARCHAR(100) ,
                       PasswordHash VARCHAR(255) NOT NULL,
                       CreatedAt TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                       nickname varchar(100),
                       user_pic varchar(255)
);

-- 创建文章类别表
CREATE TABLE if not exists ArticleCategories (
                                   CategoryID INT AUTO_INCREMENT PRIMARY KEY, -- 类别ID，主键
                                   CategoryName VARCHAR(100) NOT NULL UNIQUE, -- 类别名称，唯一约束
                                   Description TEXT                           -- 类别描述
);

-- 创建文章表
CREATE TABLE if not exists Articles (
                          ArticleID INT AUTO_INCREMENT PRIMARY KEY,
                          Title VARCHAR(255) NOT NULL,
                          Content TEXT NOT NULL,
                          AuthorID INT NOT NULL,  -- 保证与 Users.UserID 数据类型一致
                          CategoryID INT,
                          CreatedAt TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                          UpdatedAt TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,

                          FOREIGN KEY (AuthorID) REFERENCES Users(UserID) ON DELETE CASCADE,
                          FOREIGN KEY (CategoryID) REFERENCES articleCategories(CategoryID) ON DELETE SET NULL
);

