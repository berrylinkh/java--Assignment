package tdd;

public class Account {
    private double balance = 0;
    private int pin;
    
    public Account (int pin) {
    this.pin = pin;
    }
    
    public void checkPin(){
    if pin != this.pin {
     throw new IllegalArgumentException("Invalid pin");
    }
    }
    public double checkBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if(amount > 0) balance += amount;
    }


    public void withdraw(double amount) {
        if (amount<= balance) balance -=amount;
    }
    
   public void setPin(int pin) {
        if (pin < 1000 || pin > 9999){
        throw new IllegalArgumentException("Invalid pin");
        }
    }
}
