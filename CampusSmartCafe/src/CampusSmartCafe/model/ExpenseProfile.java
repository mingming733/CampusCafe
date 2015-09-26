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
public class ExpenseProfile {

    @Override
    public String toString() {
        return String.format("ExpenseProfile{ totalFunds = %.2f, leftFunds = %.2f}", totalFunds, leftFunds);
//        return "ExpenseProfile{" + "totalFunds=" + totalFunds + ", leftFunds=" + leftFunds + '}';
    }
    private float totalFunds;
    private float leftFunds;

    
    // constructors
    public ExpenseProfile(){
        totalFunds = 0;
        leftFunds = 0;
    }
    public ExpenseProfile(float totalFunds, float leftFunds){
        this.totalFunds = totalFunds;
        this.leftFunds = leftFunds;
    }

// methods	
    public float getTotalFunds(){
	return totalFunds;
    }
    public void setTotalFunds(float funds){
	totalFunds = funds;
    }
    public float getLeftFunds(){
	return leftFunds;
    }
     public void setLeftFunds(float leftFunds) {
        this.leftFunds = leftFunds;
    }
    public void decreaseFunds(float amount){
	leftFunds -= amount;
    }    
}
