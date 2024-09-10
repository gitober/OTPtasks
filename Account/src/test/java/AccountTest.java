import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccountTest {
    Account account = new Account();

    @Test
    public void testDeposit() {
        account.deposit(5);
        assertEquals(5, account.getBalance(), 0.05);
    }

    @Test
    public void testWithdraw() {
        account.deposit(500);
        assertEquals(500, account.withdraw(500), 0.05);
    }

    @Test
    public void testGetBalance() {
        account.deposit(500);
        assertEquals(500, account.getBalance(), 0.05);
    }
}