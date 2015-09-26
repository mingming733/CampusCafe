/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CampusSmartCafe.model;

/**
 *
 * @author fbzisme
 */
public class Item {

    @Override
    public String toString() {
        return String.format("Item{ id = %d, name = %s, price = %.2f, calorie = %d, health_id = %d}",id, name, price, calorie, health_index);
//        return "Item{" + "id=" + id + ", name=" + name + ", price=" + price + ", calorie=" + calorie + ", health_index=" + health_index + '}';
    }


    private int id;
    private String name;
    private float price;
    private int calorie;
    private int health_index;

//	constructor

    public Item(int id, String name, float price, int calorie, int health_index) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.calorie = calorie;
        this.health_index = health_index;
    }
//	getters

    String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getCalorie() {
        return calorie;
    }
//	setters

    public void setName(String n) {
        name = n;
    }

    public void setPrice(float p) {
        price = p;
    }

    public void setCalorie(int c) {
        calorie = c;
    }
}
