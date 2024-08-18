public class Q_NivenNum {
    public static void main(String[] args) {
        int totalSum = 0;
        for (int i = 1; i <= 5; i++) {
            int oddSum = 0;
            for (int j = 1; j <= 5; j++) {
                System.out.print(j);
                if (j % 2 != 0) {
                    oddSum += j;
                }
            }
            totalSum += oddSum;
            System.out.println();
        }
        System.out.println("Total Sum=" + totalSum);
        int result = 0;
        int temp = totalSum;
        while (totalSum > 0) {
            int rem = totalSum % 10;
            result += rem;
            totalSum /= 10;
        }
        if (temp % result == 0) {
            System.out.println(temp + " is a Niven number.");
        } else {
            System.out.println(temp + " is not a Niven number.");
        }
    }
}
