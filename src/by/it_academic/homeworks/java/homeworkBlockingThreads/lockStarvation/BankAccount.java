package by.it_academic.homeworks.java.homeworkBlockingThreads.lockStarvation;

public class BankAccount{
    private double balance;
    int id;

    BankAccount(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    synchronized double getBalance() {

        try {
            Thread.sleep(100l);
        } catch (InterruptedException e) {
        }
        return balance;
    }

    synchronized void withdraw(double amount) {
        balance -= amount;
    }

    synchronized void deposit(double amount) {
        balance += amount;
    }

    synchronized void transfer(BankAccount to, double amount) {
        withdraw(amount);
        to.deposit(amount);
    }

    public static void main(String[] args) {
        final BankAccount firstAccount = new BankAccount(1, 500d);
        final BankAccount secondAccount = new BankAccount(2, 500d);

        Thread balanceMonitorThread1 = new Thread(new BalanceMonitor(firstAccount), "BalanceMonitor");
        Thread transactionThread1 = new Thread(new Transaction(firstAccount, secondAccount, 250d), "Transaction-1");
        Thread transactionThread2 = new Thread(new Transaction(firstAccount, secondAccount, 250d), "Transaction-2");

        balanceMonitorThread1.setPriority(Thread.MAX_PRIORITY);
        transactionThread1.setPriority(Thread.MIN_PRIORITY);
        transactionThread2.setPriority(Thread.MIN_PRIORITY);


        balanceMonitorThread1.start();


        try {
            Thread.sleep(100l);
        } catch (InterruptedException e) {
        }
        transactionThread1.start();
        transactionThread2.start();

    }

}

class BalanceMonitor implements Runnable {
    private BankAccount account;

    BalanceMonitor(BankAccount account) {
        this.account = account;
    }

    boolean alreadyNotified = false;

    @Override
    public void run() {
        System.out.format("%s started execution%n", Thread.currentThread().getName());
        while (true) {
            if (account.getBalance() <= 0) {

                break;
            }
        }
        System.out.format("%s : account has gone too low, email sent, exiting.", Thread.currentThread().getName());
    }

}

class Transaction implements Runnable {
    private BankAccount sourceAccount, destinationAccount;
    private double amount;

    Transaction(BankAccount sourceAccount, BankAccount destinationAccount, double amount) {
        this.sourceAccount = sourceAccount;
        this.destinationAccount = destinationAccount;
        this.amount = amount;
    }

    public void run() {
        System.out.format("%s started execution%n", Thread.currentThread().getName());
        sourceAccount.transfer(destinationAccount, amount);
        System.out.printf("%s completed execution%n", Thread.currentThread().getName());
    }
}
