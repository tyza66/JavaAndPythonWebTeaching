package com.tyza66.test2;

import jdk.nashorn.internal.runtime.ECMAException;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TextDemo {
    @Test
    public void textMySql(){
        //jdbc连接MySQl数据库
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "";
            String user = "";
            String password = "";
            Connection conn = DriverManager.getConnection(url,user,password);
        }
        catch (ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
    }
}
