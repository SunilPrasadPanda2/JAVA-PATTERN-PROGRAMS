import java.util.Scanner;

public class PyramidHollow2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height of the pyramid :");
        int h = sc.nextInt();
        int st = 1;
        int sp = h - 1;
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= st; j++) {
                if (j == 1 || j == st || i == h) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            sp--;
            st += 2;
            System.out.println();
        }
        sc.close();
    }
}
