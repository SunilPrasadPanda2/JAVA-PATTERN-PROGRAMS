import java.util.Scanner;

public class PyramidHollow1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows:");
        int r = sc.nextInt();
        int sp = r - 1;
        int st = 1;
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= st; j++) {
                if (j == 1 || j == st || i == r) {
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
