package project.console;

import project.builder.AccountBuilder;
import project.entity.Tariff;
import project.entity.Account;
import project.entity.Subscriber;

import java.util.Scanner;

public class Console {
    private Account account;
    private Tariff tariff;
    AccountBuilder accountBuilder = new AccountBuilder();
    private Scanner scanner = new Scanner(System.in);

    public Console() {
        this.account = account;
        this.tariff = tariff;
        this.accountBuilder = accountBuilder;
    }

    public void run() {
        while (true) {
            init();
        }
    }

    private void init() {
        message();
        String choice = getChoiceOneChar();
        switch (choice) {
            case "1": {
                accountBuilder.drawUpContract();
                break;
            }
            case "2": {
                accountBuilder.openNumbers();
                break;
            }
            case "3": {
                accountBuilder.editAccount();
                break;
            }
            case "4": {
                accountBuilder.infoAccount();
                break;
            }
            case "5": {
                accountBuilder.checkBalanceAndTraffic();
                break;
            }
            case "6": {
                accountBuilder.infoPayment();
                break;
            }
            case "7": {
                accountBuilder.changeTariff();
                break;
            }
            case "8": {
                accountBuilder.topAccount();
                break;
            }
            case "9": {
                accountBuilder.closeAccountAndNumbers();
                System.exit(0);
            }
            default: {
                System.out.println("Your input wrong choice");
            }
        }
    }

    private String getChoiceOneChar() {
        return String.valueOf(scanner.next().trim().charAt(0));
    }

    private void message() {
        System.out.println("------------------------------------");
        System.out.println("1 - draw up a contract");
        System.out.println("2 - open an account and number");
        System.out.println("3 - edit the subscriber account");
        System.out.println("4 - get all the up-to-date information on the subscriber's number");
        System.out.println("5 - check the status of the balance and the remainder of the traffic");
        System.out.println("6 - view details and information about payments");
        System.out.println("7 - change the tariff plan, operator");
        System.out.println("8 - top up your account");
        System.out.println("9 - close an account and number");
    }
}
