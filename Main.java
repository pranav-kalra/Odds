import java.util.Random;

public class Main {
    public static int numT = 0;
    public static int numF = 0;
    public static int count = 100000;

    public static void main(String[] args) {
	// write your code here
        scenario1();
        scenario2();
        scenario3();
        scenario4();
        scenario5();
    }

    public static void scenario1() {
        for (int i = 0; i < count; i++) {
            int result = roll();
            if (result % 2 == 1) {numT++;}
            else {numF++;}
        }
        double rate = ((double)numT / count) * 100;
        System.out.println("Using a single 6-sided die, what is the probability of rolling an odd number?");
        System.out.println("Scenario: Expected result: 50% or 3/6");
        System.out.printf("Count of True: %d",numT);
        System.out.printf("%nCount of False: %d",numF);
        System.out.printf("%nCondition Reached: %f%%",rate);
    }

    public static void scenario2() {
        numT = 0; numF = 0;
        Random rand = new Random();
        for (int i = 0; i < count; i++) {
            int result = rand.nextInt(10) + 1;
            if ((result%2== 0) || (result>5)) {numT++;}
            else {numF++;}
        }
        double rate = ((double)numT / count) * 100;
        System.out.println("\n\nUsing a single 10-sided die, what is the probability of rolling an even number, or a number over 5?");
        System.out.println("Scenario: Expected result: 70% or 7/10");
        System.out.printf("Count of True: %d",numT);
        System.out.printf("%nCount of False: %d",numF);
        System.out.printf("%nCondition Reached: %f%%",rate);
    }

    public static void scenario3() {
        numT = 0; numF = 0;
        for (int i = 0; i < count; i++) {
            int result1 = roll();
            int result2 = roll();
            if ((result1%2==0) && (result2%2==1)) {numT++;}
            else {numF++;}
        }
        double rate = ((double)numT / count) * 100;
        System.out.println("\n\nUsing a single 6-sided die, what is the probability of rolling an even number on the first roll, and an odd number on the second role?");
        System.out.println("Scenario: Expected result: 25% or 9/36");
        System.out.printf("Count of True: %d",numT);
        System.out.printf("%nCount of False: %d",numF);
        System.out.printf("%nCondition Reached: %f%%",rate);
    }

    public static void scenario4() {
        numT = 0; numF = 0;
        for (int i = 0; i < count; i++) {
            int result1 = roll();
            int result2 = roll();
            int result3 = roll();
            if ((result1<3) && (result2==3 || result2==4) && (result3>4)) {numT++;}
            else {numF++;}
        }
        double rate = ((double)numT / count) * 100;
        System.out.println("\n\nUsing a single 6-sided die, what is the probability of rolling a 1 or 2 on the first roll, a 3 or 4 on the second roll, and a 5 or 6 on the last role?");
        System.out.println("Scenario: Expected result: 3.7% or 1/27");
        System.out.printf("Count of True: %d",numT);
        System.out.printf("%nCount of False: %d",numF);
        System.out.printf("%nCondition Reached: %f%%",rate);
    }

    public static void scenario5() {
        numT = 0; numF = 0;
        for (int i = 0; i < count; i++) {
            int result1 = roll();
            int result2 = roll();
            int result3 = roll();
            int result4 = roll();
            if (((result1!=result2)&&(result1!=result3)&&(result1!=result4)) && ((result2!=result3)&&(result2!=result4)) && (result3!=result4)) {numT++;}
            else {numF++;}
        }
        double rate = ((double)numT / count) * 100;
        System.out.println("\n\nUsing a single 6-sided die, what is the probability of rolling a 1 or 2 on the first roll, a 3 or 4 on the second roll, and a 5 or 6 on the last role?");
        System.out.println("Scenario: Expected result: 27.7% or 60/216");
        System.out.printf("Count of True: %d",numT);
        System.out.printf("%nCount of False: %d",numF);
        System.out.printf("%nCondition Reached: %f%%",rate);
    }

    public static int roll() {
        Random rand = new Random();
        int result = rand.nextInt(6)+1;
        return result;
    }
}
