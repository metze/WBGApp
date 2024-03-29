package com.wbgapp.webteam.wbgapp.structure;

import com.wbgapp.webteam.wbgapp.database.HTTPLoginHandler;

/**
 * Created by Deathlymad on 16.01.2016.
 */
public class Account {

    private String _username;
    private String _email;
    private String _class;
    private String _name;


    public Account(String user)
    {
        _username = user;
    }

    public boolean login(String pw)
    {
        HTTPLoginHandler handler = new HTTPLoginHandler("");
        try {
            return handler.login(_username, pw);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public String getName()
    {
        return _name;
    }
}
