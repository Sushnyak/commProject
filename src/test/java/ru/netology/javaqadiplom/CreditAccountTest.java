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

    //@Test
    //public void shouldThrowAnExceptionIfNegativeRate() {

    //    Assertions.assertThrows(IllegalArgumentException.class, () -> {
    //        CreditAccount account = new CreditAccount(
    //                0,
    //                5_000,
    //                -15
    //        );
    //    } );
   // }

    //@Test
    //public void shouldThrowAnExceptionIfNegativeInitialBalance() {

    //    Assertions.assertThrows(IllegalArgumentException.class, () -> {
    //        CreditAccount account = new CreditAccount(
    //                -1_000,
    //                5_000,
    //                15
    //        );
    //    } );
    //}

    //@Test
    //public void shouldThrowAnExceptionIfNegativeCreditLimit() {

    //    Assertions.assertThrows(IllegalArgumentException.class, () -> {
    //        CreditAccount account = new CreditAccount(
    //                0,
    //                -5_000,
    //                15
    //        );
    //    } );
   // }



    //@Test
    //public void showBalanceAfterPurchase(){
    //    CreditAccount account = new CreditAccount(
    //            0,
    //            5_000,
    //            15
    //    );

    //    account.add(3_000);
    //    account.pay(1_000);

    //    Assertions.assertEquals(2_000, account.getBalance());
    //}

    //@Test
    //public void showBalanceAfterPurchaseExceedingBalance(){
    //    CreditAccount account = new CreditAccount(
    //            0,
    //            5_000,
    //            15
    //    );

    //    account.add(3_000);
    //    account.pay(4_000);

    //    Assertions.assertEquals(3_000, account.getBalance());
    //}
    //.g
    // 31232131321313
}
