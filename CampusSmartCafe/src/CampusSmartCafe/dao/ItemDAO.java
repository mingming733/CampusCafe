/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CampusSmartCafe.dao;


import CampusSmartCafe.model.Item;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fbzisme
 */
public class ItemDAO {
    public static List<Item> listItems(int fs_id) {
        Connection conn = DBManager.getConnection();
        List<Item> item_list = new ArrayList<Item>();
        try {
            Statement stmt = conn.createStatement();
            String sql = "SELECT items.id as id, items.name as name, items.price as price, items.calorie as calorie, items.health_index as health_index FROM items INNER JOIN item_foodstore_line_items ON items.id = item_foodstore_line_items.item_id WHERE item_foodstore_line_items.foodstore_id = " + fs_id +";";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()) {
                item_list.add(new Item(rs.getInt("id"), rs.getString("name"), rs.getFloat("price"), rs.getInt("calorie"), rs.getInt("health_index")));
            }
            return item_list;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
