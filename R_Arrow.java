public class R_Arrow {
    public static void main(String[] args) {
        int k = 2;
        for (int i = 1; i <= 9; i++) {
            if (i <= 5) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 1; j <= i - k; j++) {
                    System.out.print("*");
                }
                k += 2;
            }
            System.out.println();
        }
    }
}
