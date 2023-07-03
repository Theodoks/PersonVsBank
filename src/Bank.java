import java.lang.Math;

public class Bank {
    int capital;
    double coefficient;

    Bank(int capital, double coefficient){
        this.capital = capital;
        this.coefficient = coefficient;
    }
    void credit(Person P, int requestedSum, float months) {
        double percentage = coefficient * Math.sqrt(months);
        double x = percentage * requestedSum;
        if (x <= P.money + P.wage * months) {
            P.debt += percentage * requestedSum;
            System.out.println("CREDIT FOR " + requestedSum + " GRANTED (DEBT = " + P.debt + ")");
            capital -= requestedSum;

            P.money += requestedSum;

            for (int i = 0; i < months; i++) {
                P.money -= P.debt / (months - i);
                P.money += P.wage;
                capital += P.debt / (months - i);
                P.debt -= P.debt / (months - i);
                System.out.println("MONTH " + (i+1));
                System.out.println("Person's Money = " + P.money);
                System.out.println(("Bank's Capital = " + capital + "\n"));
            }
        } else {
            System.out.println(("CREDIT DENIED"));
        }

    }
}
