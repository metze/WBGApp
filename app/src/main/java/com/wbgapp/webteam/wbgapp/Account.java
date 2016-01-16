package com.wbgapp.webteam.wbgapp;

/**
 * Created by Deathlymad on 16.01.2016.
 */
public class Account {

    private String _username;
    private String _email;
    private String _class;
    private String _name;


    Account(String user)
    {
        _username = user;
    }

    boolean login(String pw)
    {
        return false;
    }

    String getName()
    {
        return _name;
    }
}
