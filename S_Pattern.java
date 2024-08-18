import java.util.Scanner;

public class S_Pattern {
    /*
     * Enter -
     * row=odd number to get proper output
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int r = sc.nextInt();
        int c = (r + 1) / 2;
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                if (i == 1 || i == r || i == (r + 1) / 2 || (j == 1 && i <= (r + 1) / 2)
                        || (j == c && i > (r + 1) / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
