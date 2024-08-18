public class P_SumOfDiagonal {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(j);
                if (i == j) {
                    sum += j;
                }
            }
            System.out.println();
        }
        System.out.println("sum=" + sum);
    }
}
