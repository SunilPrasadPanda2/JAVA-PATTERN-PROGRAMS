public class O_Reverse_SumEven {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 2; i++) {
            if (i % 2 != 0) {
                for (int j = 1; j <= 5; j++) {
                    System.out.print(j);
                }
            } else {
                for (int j = 5; j >= 1; j--) {
                    System.out.print(j);
                }
                int k = 3;
                for (int j = 5; j >= k; j--) {
                    sum = sum + j;
                }
            }
            System.out.println();
        }
        System.out.println("sum=" + sum);
    }
}
