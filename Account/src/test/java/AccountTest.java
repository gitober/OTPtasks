import org.junit.AfterClass;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccountTest {
    Account account = new Account();

    @BeforeClass
    public static void setUp() {
        System.out.println("Test starts");
    }

    @Before
    public void setUpBeforeTests() {
        System.out.println("Before each test");
        account.deposit(0);
    }

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

    @After
    public void cleanUpAfterTests() {
        System.out.println("After each test");
    }

    @AfterClass
    public static void tearDown() {
        System.out.println("End the test");
    }
}
