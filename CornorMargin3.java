public class CornorMargin3 {
    public static void main(String[] args) {
        int size = 7;
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (((i == 1 || i == size) && (j <= 2 || j >= (size - 1)))
                        || ((j == 1 || j == size) && (i <= 2 || i >= (size - 1)))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
