package base.basics;

public class LargetContigousArraySum {

    public static void main(String[] args) {
        int [] num = {-2,1,-3,4,-1,2,1,-5,-4};
        // largest sub array = 4, -1, 2, 1
        // ans = 6
        System.out.println(largeSum(num));
    }

    public static int largeSum(int [] num) {
        // var to hold the sum start with 0, it should only keep growing
        int sum = 0;
        int maximum = Integer.MIN_VALUE;

        for (int i=0;i<num.length;i++) {

            int currItem = num[i];
            sum = sum+currItem;

            if (sum>maximum) {
                maximum=sum;
            }

            if (sum<0) {
                sum=0;
            }
        }

        return maximum;
    }
}
