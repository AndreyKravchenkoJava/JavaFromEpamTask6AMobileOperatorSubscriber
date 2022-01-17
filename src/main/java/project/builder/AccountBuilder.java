package project.builder;

import project.entity.Account;
import project.entity.Tariff;
import project.utils.AccountInfo;

import java.util.Scanner;
import java.util.regex.Pattern;

public class AccountBuilder implements AccountInfo {
    Account account = new Account("Андрей Витальевич Кравченко", 18, 0506767334, Tariff.SuperNet_Pro, 3, 12.3, 180, "26.11.2021", 180, "26.10.2021", 170, "26.09.2021", "Dnipro");

    public void drawUpContract() {
        System.out.println("Contract draw up. Date: 28.11.2021");
    }

    public void openNumbers() {
        System.out.println("Numbers open");
    }

    public void editAccount() {
        System.out.println("Enter a new name: ");
        Scanner scanner = new Scanner(System.in);
        String newName = scanner.next();
        System.out.println("New name: " + newName);
        System.out.println("Enter the new age: ");
        int newAge = scanner.nextInt();
        System.out.println("New age: " + newAge);
        System.out.println("Enter the new numbers: ");
        int newNumbers = scanner.nextInt();
        System.out.println("New numbers: " + newNumbers);
    }

    public void infoAccount() {
        System.out.println("name: " + account.getName());
        System.out.println("Age: " + account.getAge());
        System.out.println("Numbers: " + account.getNumbers());
        System.out.println("Tariff: " + account.getTariff());
    }

    public void checkBalanceAndTraffic() {
        System.out.println("Balance: " + account.getBalance());
        System.out.println("Traffic: " + account.getTraffic());
    }

    public void infoPayment() {
        System.out.println("First payment: " + account.getPayment3() + ", date: " + account.getDate3());
        System.out.println("Next payment: " + account.getPayment2() + ", date: " + account.getDate2());
        System.out.println("Last payment: " + account.getPayment1() + ", date: " + account.getDate1());
    }

    public void changeTariff() {
        System.out.println("Current traffic: " + account.getTariff());
        System.out.println("Choose one of the below: ");
        for (Tariff element: Tariff.values())
        System.out.println(element);
    }

    public void topAccount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the amount of money to which you would like to replenish your account: ");
        int amount = scanner.nextInt();
        int newBalance = account.getBalance() + amount;
        System.out.println("New balance: " + newBalance);
    }

    public void closeAccountAndNumbers() {
        System.out.println("Account and numbers close");
    }
}
