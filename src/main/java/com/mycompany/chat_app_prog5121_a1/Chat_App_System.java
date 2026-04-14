package com.mycompany.chat_app_prog5121_a1;

public class Chat_App_System {

private String username;
private String password;
private String cellNumber;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getCellNumber() {
        return cellNumber;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    //conditions fro the username.
    public boolean checkUsername(String username)
    {
    return username.contains("_") && username.length()==5;
    }

}
/*
CODE ATTRIBUTION

Author: Geeks for Geeks
Title: Private Access Modifier
Date Published: 2026
Link: https://www.geeksforgeeks.org/java/access-modifiers-java/
Date accessed: 14/04/2026
*/
