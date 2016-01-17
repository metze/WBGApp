package com.wbgapp.webteam.wbgapp.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;

/**
 * Created by Deathlymad on 17.01.2016.
 */
public class SQLServer {

    private Connection _connection;
    private Properties _loginProps;
    private String _dbName;

    SQLServer(String name, Integer port, String database, String user, String pw)
    {
        _dbName = database;
        try
        {
            _loginProps = new Properties();
            _loginProps.put("user", user);
            _loginProps.put("password", pw);
            _connection = DriverManager.getConnection("jdbc:mysql://" + name + ":" + port.toString() + "/", _loginProps);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Float> queryFloatList(String table, String Tag, String cond) throws SQLException
    {
        Statement _sqlStatement = null;
        String query = "SELECT " + Tag + " FROM " + _dbName + "." + table + " WHERE " + cond;

        ArrayList<Float> list = new ArrayList<Float>();
        try
        {
            _sqlStatement = _connection.createStatement();
            ResultSet res = _sqlStatement.executeQuery(query);
            while(res.next())
            {
                list.add(res.getFloat(Tag));
            }
        } catch (SQLException e)
        {
            e.printStackTrace();
        } finally
        {
            if (_sqlStatement != null){_sqlStatement.close();}
        }
        return list;
    }
    public ArrayList<Integer> queryIntList(String table, String Tag, String cond) throws SQLException
    {
        Statement _sqlStatement = null;
        String query = "SELECT " + Tag + " FROM " + _dbName + "." + table + " WHERE " + cond;

        ArrayList<Integer> list = new ArrayList<Integer>();
        try
        {
            _sqlStatement = _connection.createStatement();
            ResultSet res = _sqlStatement.executeQuery(query);
            while(res.next())
            {
                list.add(res.getInt(Tag));
            }
        } catch (SQLException e)
        {
            e.printStackTrace();
        } finally
        {
            if (_sqlStatement != null){_sqlStatement.close();}
        }
        return list;
    }
    public ArrayList<String> queryStringList(String table, String Tag, String cond) throws SQLException
    {
        Statement _sqlStatement = null;
        String query = "SELECT " + Tag + " FROM " + _dbName + "." + table + " WHERE " + cond;

        ArrayList<String> list = new ArrayList<String>();
        try
        {
            _sqlStatement = _connection.createStatement();
            ResultSet res = _sqlStatement.executeQuery(query);
            while(res.next())
            {
                list.add(res.getString(Tag));
            }
        } catch (SQLException e)
        {
            e.printStackTrace();
        } finally
        {
            if (_sqlStatement != null){_sqlStatement.close();}
        }
        return list;
    }
}
