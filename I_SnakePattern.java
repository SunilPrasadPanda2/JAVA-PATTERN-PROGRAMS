import java.util.Scanner;

public class I_SnakePattern {
    /*
     * when size=5
     * 1 2 3 4 5
     * 10 9 8 7 6
     * 11 12 13 14 15
     * 20 19 18 17 16
     * 21 22 23 24 25
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size:");
        int size = sc.nextInt();
        for (int i = 1; i <= size; i++) {
            if (i % 2 != 0) {
                int n = ((i - 1) * size) + 1;
                for (int j = 1; j <= size; j++) {
                    System.out.print(n + "\t"); // "\t" used for tab
                    n++;
                }
            } else {
                int n = i * size;
                for (int j = 1; j <= size; j++) {
                    System.out.print(n + "\t"); // "\t" used for tab
                    n--;
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
