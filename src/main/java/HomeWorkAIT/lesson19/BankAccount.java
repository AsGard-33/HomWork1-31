package HomeWorkAIT.lesson19;
/*Создайте класс "Банковский счет" Поля: номер счета, баланс.
Методы: конструкторы, deposit(double amount) - добавляет сумму на счет,
withdraw(double amount) - снимает сумму со счета.
Создайте класса "Тест" В этом классе создайте несколько объектов вышеуказанного класса и
 вызовите их методы.*/
public class BankAccount {
    private int accountNumber;

    private double balance;

    public BankAccount(int accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Nedostatochno sredstv na schete.");
        }
    }

    public double getBalance() {
        return balance;
    }
}

 class Test {
    public static void main(String[] args){
        BankAccount euroKonto1 = new BankAccount(355236,500000);
        System.out.println("Tekushij balance: " + euroKonto1.getBalance());

        euroKonto1.deposit(234);
        System.out.println("Balance popolnen: " + euroKonto1.getBalance());
        BankAccount euroKonto2 = new BankAccount(355236,euroKonto1.getBalance() );

        euroKonto2.withdraw(34);
        System.out.println("S balansa snyaty sredstva,ostatok: " + euroKonto2.getBalance());
    }
}

