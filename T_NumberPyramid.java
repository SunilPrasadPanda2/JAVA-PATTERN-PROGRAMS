public class T_NumberPyramid {
    public static void main(String[] args) {
        int n = 7;
        int sp = n - 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (i == 1) {
                    System.out.print(j);
                } else {
                    System.out.print(j + " ");
                }
            }
            sp--;
            System.out.println();
        }
    }
}
