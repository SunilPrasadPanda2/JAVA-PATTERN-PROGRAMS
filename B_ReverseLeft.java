import java.util.Scanner;

public class B_ReverseLeft {
    /*
     * when size=5
     * *****
     * ****
     * ***
     * **
     * *
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size:");
        int size = sc.nextInt();
        for (int i = 1; i <= size; i++) {
            for (int j = i; j <= size; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
