import java.util.Scanner;

public class H_2NumWithStar {
    /*
     * when size=5
     * 5*4*3*2*1
     * 5*4*3*2
     * 5*4*3
     * 5*4
     * 5
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size:");
        int size = sc.nextInt();
        for (int i = 1; i <= size; i++) {
            for (int j = size; j >= i; j--) {
                if (j != i) {
                    System.out.print(j + "*");
                } else {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
