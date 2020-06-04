package JavaTechnoStudy.day48.tasks.task1;

import JavaTechnoStudy.day42.tasks.task1.Currency;

public class BankingSystem {

    public static void main(String[] args) {
        ChaseBank chaseBank1 = new ChaseBank("Chase",
                "Main 1089",
                "info@chase.com",
                "+1 258 964 72 25",
                0,
                Currency.USD,
                1.0001,
                1.3023,
                100
        );

        chaseBank1.deposit(1000);
        chaseBank1.withdraw(200);

        chaseBank1.buyEuroWithDollar(10);
        chaseBank1.sellEuroGetDollar(20);

        System.out.println(chaseBank1);

        Bank bankOFAmerica = new BankOfAmerica("Bank Of America", "423 CLifton", "dogan@info",
                "23 3435", 5987.80, Currency.EU);

        bankOFAmerica.buyEuroWithDollar(500);
        bankOFAmerica.sellEuroGetDollar(200);
        bankOFAmerica.deposit(5_000);
        bankOFAmerica.withdraw(2_000);

        System.out.println("==================================================");

        System.out.println(bankOFAmerica);
    }


}




