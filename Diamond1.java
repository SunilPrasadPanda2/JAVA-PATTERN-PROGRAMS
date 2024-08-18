public class Diamond1 {
    public static void main(String[] args) {
        int sp = 3;
        int st = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= st; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
            if (i < 3) {
                sp--;
                st += 2;

            } else {
                sp++;
                st -= 2;
            }
        }
    }
}
