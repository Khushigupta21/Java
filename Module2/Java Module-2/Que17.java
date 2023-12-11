package basic;
abstract class Bank {
    public abstract void getBalance();
}

class BankA extends Bank {
    private int balance = 100;
    @Override
    public void getBalance() {
        System.out.println("Balance in Bank A: $" + balance);
    }
}

class BankB extends Bank {
    private int balance = 150;
    @Override
    public void getBalance() {
        System.out.println("Balance in Bank B: $" + balance);
    }
}

class BankC extends Bank {
    private int balance = 200;
    @Override
    public void getBalance() {
        System.out.println("Balance in Bank C: $" + balance);
    }
}
public class Que17 {
	public static void main(String[] args) {
		BankA bankA = new BankA();
        BankB bankB = new BankB();
        BankC bankC = new BankC();

        bankA.getBalance();
        bankB.getBalance();
        bankC.getBalance();
	}
}
