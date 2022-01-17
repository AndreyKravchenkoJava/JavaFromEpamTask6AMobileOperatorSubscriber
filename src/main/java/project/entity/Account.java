package project.entity;

import java.util.Objects;

public class Account extends Subscriber {
    private int numbers;
    Tariff tariff;
    private int balance;
    private double traffic;
    private int payment1;
    private String date1;
    private int payment2;
    private String date2;
    private int payment3;
    private String date3;
    private String placeContract;

    public Account(String name, int age, int numbers, Tariff tariff, int balance, double traffic, int payment1, String date1, int payment2, String date2, int payment3, String date3, String placeContract) {
        super(name, age);
        this.numbers = numbers;
        this.tariff = tariff;
        this.balance = balance;
        this.traffic = traffic;
        this.payment1 = payment1;
        this.date1 = date1;
        this.payment2 = payment2;
        this.date2 = date2;
        this.payment3 = payment3;
        this.date3 = date3;
        this.placeContract = placeContract;
    }

    public int getNumbers() {
        return numbers;
    }

    public Tariff getTariff() {
        return tariff;
    }

    public int getBalance() {
        return balance;
    }

    public double getTraffic() {
        return traffic;
    }

    public int getPayment1() {
        return payment1;
    }

    public String getDate1() {
        return date1;
    }

    public int getPayment2() {
        return payment2;
    }

    public String getDate2() {
        return date2;
    }

    public int getPayment3() {
        return payment3;
    }

    public String getDate3() {
        return date3;
    }

    public String getPlaceContract() {
        return placeContract;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Account account = (Account) o;
        return numbers == account.numbers && balance == account.balance && traffic == account.traffic && payment1 == account.payment1 && date1 == account.date1 && payment2 == account.payment2 && date2 == account.date2 && payment3 == account.payment3 && date3 == account.date3 && tariff == account.tariff && Objects.equals(placeContract, account.placeContract);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numbers, tariff, balance, traffic, payment1, date1, payment2, date2, payment3, date3, placeContract);
    }

    @Override
    public String toString() {
        return "Account{" +
                "numbers=" + numbers +
                ", tariff=" + tariff +
                ", balance=" + balance +
                ", traffic=" + traffic +
                ", payment1=" + payment1 +
                ", date1=" + date1 +
                ", payment2=" + payment2 +
                ", date2=" + date2 +
                ", payment3=" + payment3 +
                ", date3=" + date3 +
                ", placeContract='" + placeContract + '\'' +
                '}';
    }
}
