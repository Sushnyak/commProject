package ru.netology.javaqadiplom;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SavingAccountTest {


//   тесты на add

    @Test
    public void shouldAddLessThanMaxBalance() {
        SavingAccount account = new SavingAccount(
                2_000,
                1_000,
                10_000,
                5
        );


    account.add(3_000);


        Assertions.assertEquals(2_000 + 3_000, account.getBalance());
    }


    @Test
    public void shouldAddPlusOneThanMaxBalance() {
        SavingAccount account = new SavingAccount(
                2_000,
                1_000,
                10_000,
                5
        );

        account.add(8_001);

        Assertions.assertEquals(2_000, account.getBalance());
    }

    @Test
    public void shouldAddMinusOneThanMaxBalance() {
        SavingAccount account = new SavingAccount(
                2_000,
                1_000,
                10_000,
                5
        );

        account.add(7_999);

        Assertions.assertEquals(9_999, account.getBalance());
    }

    @Test
    public void shouldAddEqualMaxBalance() {
        SavingAccount account = new SavingAccount(
                2_000,
                1_000,
                10_000,
                5
        );

        account.add(8_000);

        Assertions.assertEquals(10_000, account.getBalance());
    }

    @Test
    public void shouldAddZero() {
        SavingAccount account = new SavingAccount(
                2_000,
                1_000,
                10_000,
                5
        );

        account.add(0);

        Assertions.assertEquals(2_000, account.getBalance());
    }

    @Test
    public void shouldAddOne() {
        SavingAccount account = new SavingAccount(
                2_000,
                1_000,
                10_000,
                5
        );

        account.add(1);

        Assertions.assertEquals(2_001, account.getBalance());
    }

    @Test
    public void shouldAddMinusOne() {
        SavingAccount account = new SavingAccount(
                2_000,
                1_000,
                10_000,
                5
        );

        account.add(-1);

        Assertions.assertEquals(2_000, account.getBalance());
    }

    @Test
    public void shouldRateZeroSavingAccount() {
        SavingAccount account = new SavingAccount(
                2_000,
                1_000,
                10_000,
                0
        );

        account.add(1_000);

        Assertions.assertEquals(3_000, account.getBalance());


    }

    @Test
    public void shouldRateOneSavingAccount() {
        SavingAccount account = new SavingAccount(
                2_000,
                1_000,
                10_000,
                1
        );

        account.add(1_000);

        Assertions.assertEquals(3_000, account.getBalance());


    }

    @Test
    public void shouldRateMinusOneSavingAccount() {


        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            SavingAccount account = new SavingAccount(
                    2_000,
                    1_000,
                    10_000,
                    -1
            );
        });


    }

    @Test
    public void shouldExceptionMaxBalanceLowMinBalance() {


        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            SavingAccount account = new SavingAccount(
                    6_000,
                    5_000,
                    2_000,
                    2
            );
        });


    }

    @Test
    public void shouldExceptionMnBalanceLowInitBalance() {


        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            SavingAccount account = new SavingAccount(
                    1_999,
                    2_000,
                    10_000,
                    2
            );
        });


    }

    @Test
    public void shouldInitBalanceEqualsMinBalance() {
        SavingAccount account = new SavingAccount(
                1_000,
                1_000,
                10_000,
                1
        );

        account.add(1_000);

        Assertions.assertEquals(2_000, account.getBalance());


    }

    @Test
    public void shouldInitBalanceMoreThenMinBalance() {
        SavingAccount account = new SavingAccount(
                1_001,
                1_000,
                10_000,
                1
        );

        account.add(1_000);

        Assertions.assertEquals(2_001, account.getBalance());


    }

//    тесты на pay


    @Test
    public void shouldNotGetAmountZero() {
        SavingAccount account = new SavingAccount(
                2_000,
                1_000,
                10_000,
                5
        );
        account.pay(0);

        Assertions.assertEquals(2_000, account.getBalance());
    }

    @Test
    public void shouldNotGetAmountMinusOne() {
        SavingAccount account = new SavingAccount(
                2_000,
                1_000,
                10_000,
                5
        );
        account.pay(-1);

        Assertions.assertEquals(2_000, account.getBalance());
    }

    @Test
    public void shouldGetAmountPlusOne() {
        SavingAccount account = new SavingAccount(
                2_000,
                1_000,
                10_000,
                5
        );
        account.pay(1);

        Assertions.assertEquals(1_999, account.getBalance());
    }

    @Test
    public void shouldGetAmountEqualsMinBalance() {
        SavingAccount account = new SavingAccount(
                2_000,
                1_000,
                10_000,
                5
        );
        account.pay(1_000);

        Assertions.assertEquals(1_000, account.getBalance());
    }

    @Test
    public void shouldNotGetAmountMoreThanMinBalance() {
        SavingAccount account = new SavingAccount(
                2_000,
                1_000,
                10_000,
                5
        );
        account.pay(1_001);

        Assertions.assertEquals(2_000, account.getBalance());
    }

    @Test
    public void shouldGetAmountLessThanMinBalance() {
        SavingAccount account = new SavingAccount(
                2_000,
                1_000,
                10_000,
                5
        );
        account.pay(999);

        Assertions.assertEquals(1_001, account.getBalance());
    }

// тесты на годовую ставку


    @Test
    public void shouldGetYearChange() {
        SavingAccount account = new SavingAccount(
                8_165,
                2_000,
                10_000,
                5
        );


        Assertions.assertEquals(405, account.yearChange());
    }

    @Test
    public void shouldBalanceZero() {
        SavingAccount account = new SavingAccount(
                0,
                0,
                10_000,
                5
        );


        Assertions.assertEquals(0, account.yearChange());
    }

    @Test
    public void shouldRateZero() {
        SavingAccount account = new SavingAccount(
                2_000,
                1_000,
                10_000,
                0
        );


        Assertions.assertEquals(0, account.yearChange());
    }

    @Test
    public void shouldBalanceOne() {
        SavingAccount account = new SavingAccount(
                1,
                1,
                10_000,
                5
        );


        Assertions.assertEquals(0, account.yearChange());
    }

    @Test
    public void shouldRateOne() {
        SavingAccount account = new SavingAccount(
                2_000,
                1_000,
                10_000,
                1
        );


        Assertions.assertEquals(20, account.yearChange());
    }


}



