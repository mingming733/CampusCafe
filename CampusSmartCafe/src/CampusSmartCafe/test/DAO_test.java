/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CampusSmartCafe.test;

import CampusSmartCafe.dao.*;
import CampusSmartCafe.model.*;
import java.util.List;

/**
 *
 * @author fbzisme
 */
public class DAO_test {

    public static void main(String[] args) {
        Account acc1 = AccountDAO.createNewAccount("abcd", "123");
        System.out.println(acc1.toString());
//        Account acc2 = AccountDAO.loadAccount("abc", "123");
//        System.out.println(acc2);
//        AccountDAO.updateTotal(acc2, 600, -1);
//        System.out.println(acc2);
//        AccountDAO.updateTotal(acc2, -1f, 6000);
//        System.out.println(acc2);
//        AccountDAO.updateLeft(acc2, 100.9f, 800);
//        System.out.println(acc2);
//        List<FoodStore> fs_list = FoodStoreDAO.listFoodStores();
//        System.out.println(fs_list);
//        for (int i = 0; i < fs_list.size(); i++) {
//            List<Item> item_list = ItemDAO.listItems(fs_list.get(i).getId());
//            System.out.println(item_list);
//            System.out.println(item_list.size());
//        }

    }
}
