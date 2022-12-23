package tdd;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    @Test
    public void setNameTest() {
        Account malik = new Account();
        malik.setName("Abdulmalik");

    }
    @Test
    public void getNameTest(){
        Account malik = new Account();
        malik.setName("Abdulmalik");
        malik.getName();
    }
    @Test
    public void accountNumberTest(){
        Account malik = new Account();
        malik.setAccountNumber("2210785731");
        String accountNumber = malik.getAccountNumber();
        assertEquals("2210785731", accountNumber );
    }
    @Test
    public void depositTest(){
        Account malik = new Account();
        malik.deposit(1000);
        double balance = malik.getBalance();
        assertEquals(1000, balance);
    }
    @Test
    public void depositTwiceTest(){
        Account malik = new Account();
        malik.deposit(1500);
        malik.withdraw(1500);
        double balance = malik.getBalance();
        assertEquals(0, balance);
    }

    @Test
    public void withdrawTest(){
        Account malik = new Account();
        malik.deposit(1500);
        malik.withdraw(49);
        double balance = malik.getBalance();
        assertEquals(1451, balance);
    }


}

