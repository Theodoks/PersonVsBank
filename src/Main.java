public class Main {
    public static void main(String[] args) {
        Person Aboba = new Person("Abobov Aboba Abobich", 42, 11337228, 150000, 0);
        Bank Tinkoff = new Bank(100000000, 1.2);

        Tinkoff.credit(Aboba, 2000000, 6);




    }
}