class Account {
    int balance;

    synchronized void balInquiry(int bal, int wd) {
        balance = bal - wd;
        try {
            Thread.sleep(400);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("THREAD ID=" + Thread.currentThread().getId() + " BALANCE=" + balance);
    }
}

class MyThread1 extends Thread {
    Account a;
    int balance;

    MyThread1(Account a, int bal) {
        this.a = a;
        this.balance = bal;
    }

    public void run() {
        for (int i = 0; i <= 5; i++) {
            a.balInquiry(balance, 30);
            balance = a.balance;
        }
    }
}

class MyThread2 extends Thread {
    Account a;
    int balance;

    MyThread2(Account a, int bal) {
        this.a = a;
        this.balance = bal;
    }

    public void run() {
        for (int i = 0; i <= 5; i++) {
            a.balInquiry(balance, 20);
            balance = a.balance;
        }
    }
}

public class MultiThreadingWithSynchronization {
    public static void main(String args[]) {
        Account a = new Account();
        MyThread1 t1 = new MyThread1(a, 2000);
        MyThread2 t2 = new MyThread2(a, 5000);
        t1.start();
        t2.start();
    }
}
