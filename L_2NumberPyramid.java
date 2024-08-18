import java.util.Scanner;

public class L_2NumberPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height of the pyramid :");
        int h = sc.nextInt();
        int sp = h - 1;
        int i;
        for (i = 1; i <= h; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }
            int k;
            for (k = 1; k <= i; k++) {
                System.out.print(k);
            }
            k = i - 1;
            for (; k >= 1; k--) {
                System.out.print(k);
            }
            sp--;
            System.out.println();
            sc.close();
        }
    }
}
