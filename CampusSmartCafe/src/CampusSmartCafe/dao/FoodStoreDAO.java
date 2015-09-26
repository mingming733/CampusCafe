/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CampusSmartCafe.dao;

import CampusSmartCafe.model.Account;
import CampusSmartCafe.model.FSType;
import CampusSmartCafe.model.FoodStore;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fbzisme
 */
public class FoodStoreDAO {
    public static List<FoodStore> listFoodStores() {
        Connection conn = DBManager.getConnection();
        List<FoodStore> fs_list = new ArrayList<FoodStore>();
        try {
            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM foodstores;";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()) {
                int typeno = rs.getInt("type");
                if (typeno == 1){
                    fs_list.add(new FoodStore(rs.getInt("id"), rs.getString("name"), rs.getString("address"),FSType.VM, rs.getInt("wait_time")));
                } else{
                    fs_list.add(new FoodStore(rs.getInt("id"), rs.getString("name"), rs.getString("address"),FSType.CAFE, rs.getInt("wait_time")));
                }
            }
            return fs_list;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
