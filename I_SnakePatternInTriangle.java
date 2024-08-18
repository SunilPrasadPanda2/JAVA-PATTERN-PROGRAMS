public class I_SnakePatternInTriangle {
    public static void main(String[] args) {
        int sp = 4;
        int num = 1;
        int k = 1;
        int temp = 0;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print(" " + " ");
            }
            if (i % 2 == 0) {
                k = k * 2 * 2;
                temp = k;
            }
            if (i % 2 != 0) {
                if (i != 1) {
                    k = k + 1;
                }
                for (int j = 1; j <= num; j++) {
                    System.out.print(k + " ");
                    if (i != 1) {
                        k += 1;
                    }
                }
                if (i != 1) {
                    k = temp;
                }
            } else {
                for (int j = 1; j <= num; j++) {
                    System.out.print(k + " ");
                    k -= 1;
                }
                k = temp;
            }
            num += 2;
            sp -= 1;
            System.out.println();
        }
    }
}
