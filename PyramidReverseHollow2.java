import java.util.Scanner;

public class PyramidReverseHollow2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Depth od pyramid :");
        int d = sc.nextInt();
        int sp = 1;
        int st = d + 2;
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
            sp++;
            st -= 2;
            System.out.println();
        }
        sc.close();
    }
}
