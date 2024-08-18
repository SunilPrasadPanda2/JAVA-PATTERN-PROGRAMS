import java.util.Scanner;

public class DiamondHollow1 {
    // Enter row(r) as odd number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows:");
        int r = sc.nextInt();
        int sp = r / 2;
        int st = 1;
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= st; j++) {
                if (j == 1 || j == st) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            if (i <= r / 2) {
                sp--;
                st += 2;

            } else {
                sp++;
                st -= 2;
            }
            System.out.println();
        }
        sc.close();
    }
}
