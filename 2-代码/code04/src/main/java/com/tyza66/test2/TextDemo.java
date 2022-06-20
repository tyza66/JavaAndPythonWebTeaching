package com.tyza66.test2;

import jdk.nashorn.internal.runtime.ECMAException;
import org.junit.jupiter.api.Test;

public class TextDemo {
    @Test
    public void textMySql(){
        //jdbc连接MySQl数据库
        try {
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch (ECMAException | ClassNotFoundException e){
            System.out.println(e);
        }
    }
}
