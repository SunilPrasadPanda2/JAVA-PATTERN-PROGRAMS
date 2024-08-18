import java.util.Scanner;

public class E_1CrossMark {
    /*
     * when size=5
     * 
     * *___*
     * _*_*_
     * __*__
     * _*_*_
     * *___*
     * 
     * __=> space
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size:");
        int size = sc.nextInt();
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i == j || i + j == size + 1) {
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
