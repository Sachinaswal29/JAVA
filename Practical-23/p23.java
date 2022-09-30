/*  Write a class Customer having balance as a property and void withdrawal(int amount), and void deposit(int amount) as instance methods. 
There are two threads, the first thread wants to withdrawal some amount and second thread wants to deposit some amount. Apply inter thread 
communication where, if withdrawal amount is higher than current balance then first thread will wait for second thread to deposit then resume 
the withdrawal. 
*/

class Customer {
    int bal = 1000;

    public synchronized void withdrawl(int amt) {
        if (this.bal < amt) {

            try {
                wait();
                System.out.println("Waiting\n");
            }

            catch (Exception e) {
                System.out.println(e);
            }
        }
        this.bal -= amt;
        System.out.println("The Balance is: " + bal + "\n");
    }

    public synchronized void deposit(int amt) {
        bal += amt;
        System.out.println("Balance Deposited: " + bal + "\n");
        notify();
    }
}

class MyThread extends Thread {
    Customer c1;

    MyThread(Customer c1) {
        this.c1 = c1;

    }

    public void run() {
        System.out.println("Calling withdrawl\n");
        c1.withdrawl(1500);
    }
}

class MyThread2 extends Thread {
    Customer c1;

    MyThread2(Customer c1) {
        this.c1 = c1;
    }

    public void run() {
        System.out.println("Calling deposit\n");
        c1.deposit(1000);
    }
}

class Demo {
    public static void main(String args[]) {
        Customer c1 = new Customer();
        MyThread t1 = new MyThread(c1);
        MyThread2 t2 = new MyThread2(c1);
        t1.start();
        t2.start();
    }
}
