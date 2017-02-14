package Homework34;

/**
 * Created by Андрей on 15.02.2017.
 *
 * Создайте класс User со следующими полями:
 String name,
 int balance,
 int monthsOfEmployment,
 String companyName,
 int salary,
 String currency.

 Создайте get-, set-методы и конструктор с аргументами - всеми полями класса.
 Напишите методы:
 void paySalary() - добавляет заработную плату к балансу пользователя
 withdraw(int summ) - снимает деньги с баланса с комиссией 5%, если сумма < 1000 и комиссией 10% в других случаях
 companyNameLenght - вычисляет длину имя компании
 monthIncreaser(int addMonth) - увеличивает monthsOfEmployment на addMonth
 */

public class User {
    private String name;
    private int balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private String currency;

    void monthIncreaser(int addMonth){
        this.monthsOfEmployment+=addMonth;
    }
    void paySalary(){
        this.balance += this.salary;
    }

    int companyNameLenght(){
        return this.companyName.length();
    }

    void withdraw(int withdrawAmount){
        int percent = 5;
        if(withdrawAmount>=1000)percent+=5;
        int totalBalance = this.balance - withdrawAmount - withdrawAmount*percent/100;
        if(totalBalance>0){
            this.balance =this.balance  - withdrawAmount - withdrawAmount*percent/100;
            System.out.println("Success");
        }
        else System.out.println("Not Enough Money");
    }

    public User(String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
