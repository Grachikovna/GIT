public class PrintService {
    public void print(Person[] people) {
        System.out.println("Размер списка " + people.length);
        for (int i = 0; i < people.length; i++) {
            Person person = people[i];
            System.out.println("Имя " + person.getName()
                    + "; Возраст " + person.getAge()
                    + "; Телефон " + person.getPhoneNumber());
        }
        System.out.println();
    }


    public void print(Customer[] customers) {
        System.out.println("Размер списка " + customers.length);
        for (int i = 0; i < customers.length; i++) {
            Customer customer = customers[i];
            System.out.println("Имя " + customer.getName()
                    + "; Возраст " + customer.getAge()
                    + "; Телефон");

        }
        System.out.println();
    }

    public void print(Gamer[] gamers) {
        System.out.println("Размер списка играков " + gamers.length);
        for (int i = 0; i < gamers.length; i++) {
            Gamer gamer = gamers[i];
            System.out.println("Имя " + gamer.getName()
                    + "; Возраст " + gamer.getAge()
                    + "; Телефон");
        }
        System.out.println();
    }
}







