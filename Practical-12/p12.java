/*Create a class “Bank” having method getRateOfInterest(). Create child classes as HDFC, SBI and PNB and override 
getRateOfInterest() and return interest rates as 4.0, 4.5 and 5% correspondingly. */

class Bank {
    double roi;

    double getROI() {
        roi = 2.0;
        return roi;
    }
}

class HDFC extends Bank {
    double getROI() {
        roi = 4.0;
        return roi;
    }
}

class SBI extends Bank {
    double getROI() {
        roi = 4.5;
        return roi;
    }
}

class PNB extends Bank {
    double getROI() {
        roi = 5.0;
        return roi;
    }
}

class last_bank {
    public static void main(String ags[]) {
        Bank obj = new Bank();
        System.out.println(obj.getROI());
        // upcasting
        obj = new HDFC();
        System.out.println(obj.getROI());
        obj = new SBI();
        System.out.println(obj.getROI());
        obj = new PNB();
        System.out.println(obj.getROI());
    }
}
