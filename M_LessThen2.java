public class M_LessThen2 {
    public static void main(String[] args) {
        int sp = 2;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            if (i < 3) {
                sp--;
            } else {
                sp++;
            }
            System.out.println();
        }
    }
}
