public class Person {
    String fio;
    int age;
    int money;
    int wage;
    int debt;
    static void work(Person P){
        P.money += P.wage;
    }
    static void party(Person P){
        P.money /= 2;
    }

    Person(String fio, int age, int capital, int wage, int debt){
        this.fio = fio;
        this.age = age;
        this.money = capital;
        this.wage = wage;
        this.debt = debt;
    }
}
