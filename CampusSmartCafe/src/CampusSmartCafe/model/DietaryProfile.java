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
public class DietaryProfile {

    @Override
    public String toString() {
        return "DietaryProfile{" + "totalCalorie=" + getTotalCalorie() + ", leftCalorie=" + getLeftCalorie() + '}';
    }
    
    private int totalCalorie;  //calorie limit
    private int leftCalorie;        //calorie left
    
    /**
    * constructor
    * @param totalCalorie calorie limit
    * @param leftCalorie calorie left
    */
    public DietaryProfile(){
        this.totalCalorie = 0;
        this.leftCalorie = 0;
    }
    public DietaryProfile(int caloriePreference, int calorieLeft){
        this.totalCalorie = caloriePreference;
        this.leftCalorie = calorieLeft;
    }
    
    /**
     * calculate the amount of calorie left
     * @param r amount to be deducted
     */
    public void decreaseCalorie(int r){
        setLeftCalorie(getLeftCalorie() - r);
    }
    
    
    /**
     * set calorie preference
     * @param totalCalorie 
     */
    public void setTotalCalorie(int totalCalorie){
        this.totalCalorie = totalCalorie;
    }

    /**
     * @return the totalCalorie
     */
    public int getTotalCalorie() {
        return totalCalorie;
    }

    /**
     * @return the leftCalorie
     */
    public int getLeftCalorie() {
        return leftCalorie;
    }

    /**
     * @param leftCalorie the leftCalorie to set
     */
    public void setLeftCalorie(int leftCalorie) {
        this.leftCalorie = leftCalorie;
    }
}
