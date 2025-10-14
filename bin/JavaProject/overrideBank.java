package bin.JavaProject;


class Bank {
    double getInterestRate() {
        return 5.0;
    }
}

class SBI extends Bank {
   @Override
    double getInterestRate() {
        return 6.5;
    }
}

class HDFC extends Bank {
    @Override
    double getInterestRate() {
        return 7.0;
    }
}

public class overrideBank {
    public static void main(String[] args) {
        Bank b1 = new SBI();
        Bank b2 = new HDFC();

        System.out.println("SBI Rate: " + b1.getInterestRate() + "%");
        System.out.println("HDFC Rate: " + b2.getInterestRate() + "%");
    }
}

    

