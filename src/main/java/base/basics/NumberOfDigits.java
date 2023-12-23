package base.basics;

public class NumberOfDigits {
    public static void main(String[] args) {
        System.out.println(numOfDigits(-13484594));
    }

    public static int numOfDigits(int n) {
        int count = 0;

        if (n==0) {
            return count;
        }

        int value = Math.abs(n);

        while (value>0) {
            count++;
            value = value / 10;
        }

        return count;
    }
}
