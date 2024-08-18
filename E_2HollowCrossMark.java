import java.util.Scanner;

public class E_2HollowCrossMark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size:");
        int size = sc.nextInt();
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i == j || i + j == size + 1) {
                    System.out.print(" " + " ");
                } else {
                    System.out.print("*" + " ");
                }

            }
            System.out.println();
        }
        sc.close();
    }
}
