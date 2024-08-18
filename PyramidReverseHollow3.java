public class PyramidReverseHollow3 {
    public static void main(String[] args) {
        int d = 4;
        int sp = 0;
        int st = (d * 2) - 1;
        for (int i = 1; i <= d; i++) {
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
            sp += 1;
            st -= 2;
            System.out.println();
        }
    }
}
