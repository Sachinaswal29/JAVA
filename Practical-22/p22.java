/* Write a class Display having synchronized void wish(String) methods that wishes hello to given string name. 
Between printing hello and provided string name apply delay of 500 milliseconds. Suppose multiple threads are there and they are 
trying to access this wish() method concurrently on different objects then irregular output will be there. Write this application 
in such a way so that output becomes regular. 
*/

class Disp {
    public static synchronized void wish(String s) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(s);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }
}

class MyThread extends Thread {
    Disp d;
    String name;

    MyThread(Disp d, String name) {
        this.d = d;
        this.name = name;
    }

    public void run() {
        d.wish(name);
    }
}

class Demo {
    public static void main(String args[]) {
        Disp d1 = new Disp();
        Disp d2 = new Disp();
        MyThread t1 = new MyThread(d1, "Sachin");
        t1.start();
        MyThread t2 = new MyThread(d2, "Aswal");
        t2.start();
    }
}
