package OtusHomeWork;

import java.util.*;

public class OtusHomeWork6 {
    public static void main(String[] args) {


        Client client1 = new Client("Petrov Ivan Sergeevich", 34, 4501_12345);
        Client client2 = new Client("Vasiliev Fedor Yanovich", 17, 4502_12354);

        BankAcc bankAcc1 = new BankAcc("54321", 100);
        BankAcc bankAcc2 = new BankAcc("01230", 200000);

        ArrayList<BankAcc> accArrayList = new ArrayList<>();
        accArrayList.add(bankAcc1);
        accArrayList.add(bankAcc2);

        HashMap<Client, List<BankAcc>> clientListHashMap = new HashMap<>();

        clientListHashMap.put(client1, accArrayList);
        clientListHashMap.put(client2, accArrayList);


        HashMap<BankAcc, Client> accClientHashMap = new HashMap<>();

        accClientHashMap.put(bankAcc1, client1);
        accClientHashMap.put(bankAcc2, client2);

        System.out.println(getBankAcc(new Client("Petrov Ivan Sergeevich", 34, 4501_12345), clientListHashMap));
        System.out.println("_______________");
        System.out.println(getBankAcc(client1, clientListHashMap));
        System.out.println(findClient(bankAcc2, accClientHashMap));

    }

    public static List<BankAcc> getBankAcc(Client client, HashMap<Client, List<BankAcc>> clientListHashMap) {
        return clientListHashMap.get(client);
    }

    public static Client findClient(BankAcc bankAcc, HashMap<BankAcc, Client> accClientHashMap) {
        return accClientHashMap.get(bankAcc);
    }
}


class Client {
    private final String name;
    private final int age;
    private final int id;


    public Client(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;


    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (!(o instanceof Client client)) {
            return false;
        }

        return Objects.equals(client.id, this.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, id);
    }

    @Override
    public String toString() {
        return "Клиент{" +
                "ФИО='" + name + '\'' +
                ", Возраст =" + age +
                ", паспорт =" + id +
                '}' + "\n";
    }
}


class BankAcc {
    private final String acc;
    private final int money;

    public BankAcc(String acc, int money) {
        this.acc = acc;
        this.money = money;
    }

    @Override
    public String toString() {
        return "Счет {" +
                "номер счета ='" + acc + '\'' +
                ", сумма =" + money +
                '}' + "\n";
    }
}



