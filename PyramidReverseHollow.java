public class PyramidReverseHollow {
    public static void main(String[] args) {
        int r = 3;
        int sp = 1;
        int st = 5;
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= st; j++) {
                if (j == 1 || j == st || i == 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            sp++;
            st -= 2;
            System.out.println();
        }
    }
}