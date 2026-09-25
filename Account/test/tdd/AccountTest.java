import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tdd.Account;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    private Account ronkeAccount;

    @BeforeEach
    public void createAccount(){
        ronkeAccount = new Account();
    }
    @Test
    public void testThatAccountIsCreated(){
        Account ronkeAccount = new Account();
    }

    @Test
    public void testThatWhen_ICheckBalanceOfNewAccount_BalanceIsZero(){
        assertEquals(0,ronkeAccount.checkBalance());
    }

    @Test
    public void testThatWhenIDeposit2K_BalanceIs2k(){
        assertEquals(0,ronkeAccount.checkBalance());
        ronkeAccount.deposit(2000);
        assertEquals(2000, ronkeAccount.checkBalance());
    }
    @Test
    public void testThatWhenIDepositNegativeAmountBalanceDoNOtChange(){
        assertEquals( 0, ronkeAccount.checkBalance());
        ronkeAccount.deposit(  -1000);
        assertEquals( 0, ronkeAccount.checkBalance());
    }
    @Test
    public void testForMultipleDepositTransaction(){
        assertEquals(0, ronkeAccount.checkBalance());
        ronkeAccount.deposit (2000);
        assertEquals( 2000,ronkeAccount.checkBalance());
        ronkeAccount.deposit (3000);
        assertEquals(5000, ronkeAccount.checkBalance());
    }
    @Test
    public void testThatWhenIWhenIWithdrawDepositReduces(){
        assertEquals(0, ronkeAccount.checkBalance());
        ronkeAccount.deposit (3000);
        assertEquals(3000, ronkeAccount.checkBalance());
        ronkeAccount.withdraw (2000);
        assertEquals(1000, ronkeAccount.checkBalance());
    }
    @Test
    public void testForMultipleWithdrawTransaction (){
        assertEquals(0, ronkeAccount.checkBalance());
        ronkeAccount.deposit(5000);
        assertEquals(5000, ronkeAccount.checkBalance());
        ronkeAccount.withdraw(2000);
        assertEquals(3000, ronkeAccount.checkBalance());
        ronkeAccount.withdraw(3000);
        assertEquals(0, ronkeAccount.checkBalance());
    }
    @Test
    public void testThatWhenWithdrawIsGreaterThanAccontBalanceBalanceRemainTheSame() {
        assertEquals(0, ronkeAccount.checkBalance());
        ronkeAccount.deposit(2000);
        assertEquals(2000, ronkeAccount.checkBalance());
        ronkeAccount.withdraw(3000);
        assertEquals(2000, ronkeAccount.checkBalance());
    }
}