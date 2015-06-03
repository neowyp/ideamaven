package com.neo.ce.account;

import lombok.Data;

/**
 * Hello world!
 *
 */
@Data
public class App 
{
    private String id;
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        App app = new App();
        app.setId("test");
        System.out.printf(app.getId());
    }
}
