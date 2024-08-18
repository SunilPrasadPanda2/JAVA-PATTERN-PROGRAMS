public class W_Num_Space {
    public static void main(String[] args) {
        int sp = 1;
        int k = 4;
        for (int i = 1; i <= 5; i++) {
            if (i <= 1) {
                for (int j = 1; j <= 5; j++) {
                    System.out.print(j);
                }
            } else {
                for (int j = 1; j <= sp; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= k; j++) {
                    if (j == 1 || j == k) {
                        System.out.print(j);
                    } else {
                        System.out.print(" ");
                    }
                }
                k -= 1;
                sp += 1;
            }

            System.out.println();
        }
    }
}
