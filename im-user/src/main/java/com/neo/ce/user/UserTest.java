package com.neo.ce.user;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * Hello world!
 */
public class UserTest {
    public static void main(String[] args) {
        try {
            System.out.println("Hello World!");
            Properties prop = new Properties();
            InputStream fis = UserTest.class.getResourceAsStream("/config.properties");
            List<String> strs = new ArrayList<String>();
            for (int i = 0; i < 10; i++) {
                strs.add("test-" + i);
            }
            for (String str : strs) {
                System.out.println(str);
            }
            prop.load(fis);
            System.out.println("The userid property: " + prop.getProperty("userid"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
