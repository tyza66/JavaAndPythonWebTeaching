package com.tyza66.test;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test1 {
    @Test
    public void text01() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/springboot-vue?useUnicode=true&characterEncoding=utf-8&allowMultiQueries=true&useSSL=false&serverTimezone=GMT%2b8&allowPublicKeyRetrieval=true"; // 连接数据库服务器，并指定连接的数据库
        String username = "root"; // 登录名称
        String password = "LINGSHI.15"; // 登录密码
        Connection conn = DriverManager.getConnection(url,username,password);
        String sql = "insert into user values(null,'123','123',123,'123','123','123')";
        Statement stmt = conn.createStatement();
        int count = stmt.executeUpdate(sql);// 返回受影响的行数
        System.out.println("受影响的行数："+count);
        stmt.close();
        conn.close();
    }
}
