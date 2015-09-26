/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CampusSmartCafe.dao;

import java.sql.*;

/**
 *
 * @author fbzisme
 */
public class DBManager {

    private static Connection conn;

    public static Connection getConnection() {
        if (conn == null) {
            try {
                Class.forName("org.sqlite.JDBC");
                conn = DriverManager.getConnection("jdbc:sqlite:./smart_cafe.sqlite");
            } catch (Exception e) {
                System.out.println(e.getMessage());
                return null;
            }
        }
        return conn;
    }
}
