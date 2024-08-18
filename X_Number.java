public class X_Number {
    public static void main(String[] args) {
        int size = 5;
        int sp = size - 1;
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            sp--;
            System.out.println();
        }
    }
}
