

import java.util.Date;

/**
 * A class to represent a bank account. Not commented to JavaDoc standard.
 *
 * @author Sam Scott
 */
public class Account {

    private static double annualInterestRate = 0.05;
    public static int CHECKING = 1;
    public static int SAVINGS = 2;
    private static int nextId = 1000;
    private final int id;
    private double balance;
    private final Date dateCreated;
    private int type;

    public Account(int type) {
        this(type, 0.0);
    }

    public Account(int type, double balance) {
        this.balance = balance;
        this.type = type;
        dateCreated = new Date();
        id = nextId;
        nextId++;
    }

    public int getType() {
        return type;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int newBalance) {
        balance = newBalance;
    }

    public double getCurrentInterest() {
        return annualInterestRate / 12 * balance;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }


    public static double getAnnualInterestRate(){
        return annualInterestRate;
    }
    @Override
    public String toString() {
        return "Account{" + "annualInterestRate=" + annualInterestRate + ", id=" + id + ", balance=" + balance + ", dateCreated=" + dateCreated + '}';
    }
    
}
/**
 *  private int type
 *
 *  public Account(int type, double balance)
 *  {
 *      this.type = type;
 *      this.balance = balance;
 *  }
 *
 */
