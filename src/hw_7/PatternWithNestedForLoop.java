package hw_7;

public class PatternWithNestedForLoop {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*  ");
            }
            for (int k = i + 5; k <= 9; k++) {
                System.out.print(k + "  ");
            }
            System.out.println();
        }
    }
}
