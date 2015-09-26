package CampusSmartCafe.model;

public class Account {

    @Override
    public String toString() {
        return "Account{" + "id=" + id + ", username=" + username + ", password=" + password + ", dietaryProf=" + dietaryProf + ", expenseProf=" + expenseProf + '}';
    }

 
    private int id;
    private String username;       //student username
    private String password;    //student account password
    private DietaryProfile dietaryProf;           //student personal dietary profile
    private ExpenseProfile expenseProf;           //student personal expense profile
    
    /**
    * constructor
    * @param username student username
    * @param password student account password
    * @param caloriePreference student calorie limit preference
    * @param calorieLeft student calorie left
    * @param balance student balance
    */
    public Account (int id, String username, String password){
        this.id = id;
        this.username = username;
        this.password = password;
        dietaryProf = new DietaryProfile();
        expenseProf = new ExpenseProfile();
    }
    
    public Account(int id, String username, String password, DietaryProfile dietaryProf, ExpenseProfile expenseProf) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.dietaryProf = dietaryProf;
        this.expenseProf = expenseProf;
    } 
    
    /**
     * return id
     * @return id
     */
    
     public int getId() {
        return id;
    }
     
    public String getUsername() {
        return username;
    }
   
    /**
     * Checks if password matches
     * @param s password enter
     * @return true if password matches, else false
     */
//    public boolean checkPassword(String s){
//        return password.equals(s);
//    }

    /**
     * @return the dietaryProf
     */
    public DietaryProfile getDietaryProf() {
        return dietaryProf;
    }

    /**
     * @param dietaryProf the dietaryProf to set
     */
    public void setDietaryProf(DietaryProfile dietaryProf) {
        this.dietaryProf = dietaryProf;
    }

    /**
     * @return the expenseProf
     */
    public ExpenseProfile getExpenseProf() {
        return expenseProf;
    }

    /**
     * @param expenseProf the expenseProf to set
     */
    public void setExpenseProf(ExpenseProfile expenseProf) {
        this.expenseProf = expenseProf;
    }
    
}
