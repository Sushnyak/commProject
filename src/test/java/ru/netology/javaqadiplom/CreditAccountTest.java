package ru.netology.javaqadiplom;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CreditAccountTest {

    @Test
    public void shouldAddToPositiveBalance() {
        CreditAccount account = new CreditAccount(
                0,
                5_000,
                15
        );

        account.add(3_000);

        Assertions.assertEquals(3_000, account.getBalance());
    }

    @Test
    public void shouldNotChangeTheBalanceIfTheValueIsIncorrect() {
        CreditAccount account = new CreditAccount(
                0,
                5_000,
                15
        );

        account.add(-3_000);

        Assertions.assertEquals(0, account.getBalance());
    }

    @Test
    public void shouldThrowAnExceptionIfNegativeRate() {

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            CreditAccount account = new CreditAccount(
                    0,
                    5_000,
                    -15
            );
        });
    }

    @Test
    public void shouldThrowAnExceptionIfNegativeInitialBalance() {

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            CreditAccount account = new CreditAccount(
                    -1_000,
                    5_000,
                    15
            );
        });
    }

    @Test
    public void shouldThrowAnExceptionIfNegativeCreditLimit() {

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            CreditAccount account = new CreditAccount(
                    0,
                    -5_000,
                    15
            );
        });
    }

    @Test
    public void mustCreateCreditAccountSpecifiedParameters() {
        CreditAccount account = new CreditAccount(
                2_000,
                5_000,
                15
        );

        Assertions.assertEquals(2_000, account.getBalance());
        Assertions.assertEquals(5_000, account.getCreditLimit());
        Assertions.assertEquals(15, account.getRate());


    }


    @Test
    public void showBalanceAfterPurchase() {
        CreditAccount account = new CreditAccount(
                0,
                5_000,
                15
        );

        account.add(3_000);
        account.pay(1_000);

        Assertions.assertEquals(2_000, account.getBalance());
    }

    @Test
    public void showBalanceAfterPurchaseExceedingBalance() {
        CreditAccount account = new CreditAccount(
                0,
                100,
                15
        );

        account.add(3_000);
        account.pay(4_000);

        Assertions.assertEquals(3_000, account.getBalance());
    }

    @Test
    public void shouldNotChangeTheBalanceIfThePurchaseValueIsIncorrect() {
        CreditAccount account = new CreditAccount(
                0,
                5_000,
                15
        );

        account.pay(-100);

        Assertions.assertEquals(0, account.getBalance());
    }

    @Test
    public void mustCalculateInterestOnNegativeBalance() {
        CreditAccount account = new CreditAccount(
                0,
                200,
                15
        );

        account.pay(100);

        int expected = -15;
        Assertions.assertEquals(-15, account.yearChange());

    }

    @Test
    public void shouldNotCountInterestIfTheBalanceIsNonNegative() {
        CreditAccount account = new CreditAccount(
                100,
                0,
                15
        );

        int expected = -15;
        Assertions.assertEquals(0, account.yearChange());


    }

}
