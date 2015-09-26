/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CampusSmartCafe.model;

/**
 *
 * @author mingming
 */
public class FoodStore {

    
    //    private Item[] items;
//    private int[] quantity;
    private int id;
    private String name;
    private int wait_time;
    private String address;
    private FSType type;

    public FoodStore(int id, String name, String address, FSType type, int wait_time) {
        this.id = id;
        this.name = name;
        this.wait_time = wait_time;
        this.address = address;
        this.type = type;
    }
    
    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getWait_time() {
        return wait_time;
    }

    public String getAddress() {
        return address;
    }

    public FSType getType() {
        return type;
    }
    
    @Override
    public String toString() {
        return "FoodStore{" + "id=" + id + ", name=" + name + ", wait_time=" + wait_time + ", address=" + address + ", type=" + type + '}';
    }
//    public double[] getTotal(Item[] items, int[] quantity){
//        int n = quantity.length;
//        double totalPrice = 0;
//        int totalCalorie = 0;
//        for(int i=0; i<n+1; i++){
//            totalPrice = totalPrice + items[i].getPrice() * quantity[i]; 
//            totalCalorie += items[i].getCalorie() * quantity[i]; 
//        }
//        double[] total = new double[2];
//        total[0] = totalPrice;
//        total[1] = totalCalorie;
//        return total;
////        return totalPrice;
//        
//    }
//    public void order(){
//    
//    }
    
}
