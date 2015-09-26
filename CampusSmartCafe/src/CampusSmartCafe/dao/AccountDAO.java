/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CampusSmartCafe.dao;

import java.sql.Connection;
import java.sql.Statement;
import CampusSmartCafe.model.*;
import java.sql.ResultSet;

/**
 *
 * @author fbzisme
 */
public class AccountDAO {

    public static Account createNewAccount(String username, String password) {
        Connection conn = DBManager.getConnection();
        try {
            Statement stmt = conn.createStatement();
            String sql = "INSERT INTO accounts (username, password) VALUES ('" + username + "','" + password + "');";
            stmt.executeUpdate(sql);
            String sql2 = "SELECT last_insert_rowid() as id FROM accounts;";
            ResultSet rs = stmt.executeQuery(sql2);
            if (!rs.next()) {
                return null;
            }
            return new Account(rs.getInt("id"), username, password);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public static Account loadAccount(String username, String password) {
        Connection conn = DBManager.getConnection();
        try {
            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM accounts WHERE username = '" + username + "' AND password = '" + password + "';";
            ResultSet rs = stmt.executeQuery(sql);
            if (!rs.next()) {
                return null;
            }
            int id = rs.getInt("id");
            int calorie_t = rs.getInt("calorie_t");
            int calorie_l = rs.getInt("calorie_l");
            float funds_t = rs.getFloat("funds_t");
            float funds_l = rs.getFloat("funds_l");
            Account acc = new Account(id, username, password);
            acc.setDietaryProf(new DietaryProfile(calorie_t, calorie_l));
            acc.setExpenseProf(new ExpenseProfile(funds_t, funds_l));
            return acc;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

//    updateLeft: decrease funds_l by funds_d, calorie_l by calorie_l
    public static void updateLeft(Account acc, float funds_d, int calorie_d) {
        acc.getExpenseProf().decreaseFunds(funds_d);
        float funds_l = acc.getExpenseProf().getLeftFunds();
        acc.getDietaryProf().decreaseCalorie(calorie_d);
        int calorie_l = acc.getDietaryProf().getLeftCalorie();
        Connection conn = DBManager.getConnection();
        try {
            Statement stmt = conn.createStatement();
            String sql = "UPDATE accounts SET funds_l = '" + funds_l + "', calorie_l = '" + calorie_l + "' WHERE id = '" + acc.getId() + "'";
            stmt.executeUpdate(sql);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    // updateTotal with the new total funds whose value is funds_t and the new total calorie whose value is calorie_t
    public static void updateTotal(Account acc, float funds_t, int calorie_t) {
        Connection conn = DBManager.getConnection();
        ExpenseProfile eProf = acc.getExpenseProf();
        DietaryProfile dProf = acc.getDietaryProf();
        float funds_l;
        int calorie_l;
        if (funds_t > 0) {
            float f_diff = funds_t - eProf.getTotalFunds();
            funds_l = f_diff + eProf.getLeftFunds();
            eProf.setTotalFunds(funds_t);
            eProf.setLeftFunds(funds_l);
        } else {
            funds_t = eProf.getTotalFunds();
            funds_l = eProf.getLeftFunds();
        }
        if (calorie_t > 0) {
            int c_diff = calorie_t - dProf.getTotalCalorie();
            calorie_l = c_diff + dProf.getLeftCalorie();
            dProf.setTotalCalorie(calorie_t);
            dProf.setLeftCalorie(calorie_l);
        } else {
            calorie_t = dProf.getTotalCalorie();
            calorie_l = dProf.getLeftCalorie();
            
        }

        try {
            Statement stmt = conn.createStatement();
            String sql = "UPDATE accounts SET funds_t = '" + funds_t + "', funds_l = '" + funds_l + "', calorie_t = '" + calorie_t + "', calorie_l = '" + calorie_l + "' WHERE id = '" + acc.getId() + "'";
            stmt.executeUpdate(sql);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
