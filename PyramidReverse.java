public class PyramidReverse {
    public static void main(String[] args) {
        int n = 5;
        int sp = 1;
        int st = n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= st; j++) {
                System.out.print("*");
            }
            System.out.println();
            st -= 2;
            sp++;
        }
    }
}
