interface Bank {
    void getInterest();
}

class SBI implements Bank {
    public void getInterest() {
        System.out.println("SBI Interest Rate: 6%");
    }
}

class HDFC implements Bank {
    public void getInterest() {
        System.out.println("HDFC Interest Rate: 7%");
    }
}

class ICICI implements Bank {
    public void getInterest() {
        System.out.println("ICICI Interest Rate: 7.5%");
    }
}

public class bank {
    public static void main(String[] args) {
        Bank b1 = new SBI();
        Bank b2 = new HDFC();
        Bank b3 = new ICICI();

        b1.getInterest();
        b2.getInterest();
        b3.getInterest();
    }
}