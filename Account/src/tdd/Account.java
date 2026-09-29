package tdd;

public class Account {
    private double balance = 0;
    private String pin;
    
    public Account (String pin) {
    this.pin = pin;
    }
    
    public boolean checkPin(String pin) {
    
    if (this.pin.equals(pin)) {
        return true;
    } else {
        return false;
    }
    }
    public double checkBalance() {
        checkPin(pin);
        return balance;
    }

    public void deposit(double amount) {
        if(amount > 0) balance += amount;
    }

    public void withdraw(double amount, String pin) {
        checkPin(pin);
        
        if (!this.pin.equals(pin)){
        throw new IllegalArgumentException("Invalid pin");
        }
        if (amount<= balance) {
        balance -=amount;
        }
    }
        
        public void setPin(String pin) {
        if (pin.length() != 4) {
            throw new IllegalArgumentException("Invalid pin");
        }

        this.pin = pin;
    }
    
}
