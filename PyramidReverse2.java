import java.util.Scanner;

public class PyramidReverse2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the depth of the Pyramid:");
        int d = sc.nextInt();
        int sp = 1;
        int st = d + 2;
        for (int i = 1; i <= d; i++) {
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
        sc.close();
    }
}
