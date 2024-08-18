import java.util.Scanner;

public class Pyramid2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of pyramid:");
        int h = sc.nextInt();
        int sp = h - 1;
        int st = 1;
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= st; j++) {
                System.out.print("*");
            }
            System.out.println();
            st += 2;
            sp--;
        }
        sc.close();
    }
}
