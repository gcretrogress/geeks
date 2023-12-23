package base.basics;

public class PrintPattern {
    public static void main(String[] args) {
        //printPattern(4);
        //print2(4);
        print3(4);
    }

    public static void print3(int x) {
        //   *
        //  ***
        // *****
        int i=1;
        while(i<=x) {
            // For each row
            int j=0;
            while(j<=(x-i)) {// x=3, i=1, 3-1 = 2, first two spaces for 1 should be space
                System.out.print(' ');
                j++;
            }
            int k=1;
            while(k<=(2*i-1)) {
                System.out.print('x');
                k++;
            }
            System.out.println();
            i++;
        }
    }
    public static void print2(int x) {
        int i=1;
        while (i<=x) {
            int j=1;
            while (j<=x) { // change this to i if you want row to have one star
                // second row to have two stars like that...
                System.out.print('x');
                j++;
            }
            System.out.println();
            i++;
        }
    }
    public static void printPattern(int x) {
        for(int j=1;j<=x;j++) {
            System.out.print('x');
            for (int i = 1; i <= x-1; i++) {
                if(i==x-1) {
                    System.out.print('x' + "\n");
                } else {
                    System.out.print('x');
                }
            }
        }
    }
}
