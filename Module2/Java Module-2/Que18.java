package basic;
abstract class Marks {
    public abstract int getPercentage();
}

class All extends Marks {
    private int sub1, sub2, sub3;

    public All(int sub1, int sub2, int sub3) {
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }

    @Override
    public int getPercentage() {
        return (sub1 + sub2 + sub3) / 3;
    }
}

class B extends Marks {
    private int sub1, sub2, sub3, sub4;

    public B(int sub1, int sub2, int sub3, int sub4) {
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
        this.sub4 = sub4;
    }

    @Override
    public int getPercentage() {
        return (sub1 + sub2 + sub3 + sub4) / 4;
    }
}
public class Que18 {
	public static void main(String[] args) {
		All studentA = new All(80, 80, 80);
        B studentB = new B(75, 85, 90, 88);

        System.out.println("Percentage of Student A: " + studentA.getPercentage() + "%");
        System.out.println("Percentage of Student B: " + studentB.getPercentage() + "%");
    }
	
}

