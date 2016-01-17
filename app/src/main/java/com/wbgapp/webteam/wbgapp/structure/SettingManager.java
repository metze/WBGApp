package com.wbgapp.webteam.wbgapp.structure;

/**
 * Created by Deathlymad on 16.01.2016.
 */
public class SettingManager {

    public static final SettingManager instance = new SettingManager();

    private Account _currAccount; //needs to encrypt itself
    private Integer _dataBulkSize;

    SettingManager()
    {
        _currAccount = null;
        //read from XML or from savefile
    }

    public void setCurrentAccount(Account acc)
    {
        _currAccount = acc;
    }
}
