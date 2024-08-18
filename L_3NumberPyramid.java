import java.util.Scanner;

public class L_3NumberPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows :");
        int r = sc.nextInt();
        int sp = r - 1;
        int k = 1;
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= k; j++) {
                System.out.print(j);
            }
            for (int j = k - 1; j >= 1; j--) {
                System.out.print(j);
            }
            k += 1;
            sp -= 1;
            System.out.println();
        }
        sc.close();
    }
}
