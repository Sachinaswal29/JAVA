// Write a program to set and get the name of threads also set and get the priority of threads. 

class Ab extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.print("From A: " + i + " ");
        }
    }
}

class Bc extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("From B: " + i);
        }

    }
}

class Cd extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("From C: " + i);
        }

    }
}

class Test {
    public static void main(String args[]) {
        Ab c = new Ab();
        Bc b = new Bc();
        Cd d = new Cd();

        System.out.println("Getting Thread A Name: " + c.getName());
        System.out.println("Getting Thread B Name: " + b.getName());
        System.out.println("Getting Thread C Name: " + d.getName());

        c.setName("Sachin");
        b.setName("Aswal");
        d.setName("Dehradun");

        System.out.println("Getting Thread A Name after setting: " + c.getName());
        System.out.println("Getting Thread B Name after setting: " + b.getName());
        System.out.println("Getting Thread C Name after setting: " + d.getName());

        System.out.println("Getting Thread A Priority: " + c.getPriority());
        System.out.println("Getting Thread B Priority: " + b.getPriority());
        System.out.println("Getting Thread C Priority: " + d.getPriority());

        c.setPriority(1);
        b.setPriority(9);
        d.setPriority(7);
        System.out.println("Getting Thread A Priority after setting: " + c.getPriority());
        System.out.println("Getting Thread B Priority after setting: " + b.getPriority());
        System.out.println("Getting Thread C Priority after setting: " + d.getPriority());

    }
}
