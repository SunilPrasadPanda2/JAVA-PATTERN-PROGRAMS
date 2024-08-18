import java.util.Scanner;

public class Y_NextLineMoreStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of star : ");
        int n = sc.nextInt();
        int curr = 0;
        while (true) {
            curr += 1;
            int next = n - curr;
            if (next > curr) {
                n -= curr;
            } else {
                curr = n;
            }
            for (int j = 1; j <= curr; j++) {
                System.out.print("*");
            }
            System.out.println();
            if (n == curr) {
                break;
            }
        }
        sc.close();
    }
}
