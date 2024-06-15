

public class Main {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Сара", 21, 967),
                new Person("Майк", 25, 284),
                new Person("Christina", 35, 636),
                new Person("Marina", 22, 112),
                new Person("Angelina", 26, 951),
        };

        Customer[] customers = {
                new Customer("Сара", 21, 967, 5648565),
                new Customer("Майк", 25, 284, 8544544),
                new Customer("Denis", 20, 852, 8569745),
                new Customer("Gayane", 50, 855, 8574155)
        };

        Gamer[] gamers = {
                new Gamer("Марина", 22, 112, "MG"),
                new Gamer("Angelina", 26, 951, "DT")
        };

        PrintService printService = new PrintService();
        printService.print(people);
        printService.print(customers);
        printService.print(gamers);








    }
}
