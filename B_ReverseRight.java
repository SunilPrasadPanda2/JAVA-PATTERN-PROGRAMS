public class B_ReverseRight {
    public static void main(String[] args) {
        int sp = 0;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= 5; j++) {
                System.out.print("*");
            }
            sp++;
            System.out.println();
        }
        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= 5; j++) {
        // if (i == j || j == 1 || i == 5 || i >= j) {
        // System.out.print(" ");
        // } else {
        // System.out.print("*");
        // }
        // }
        // System.out.println();
        // }
    }
}
