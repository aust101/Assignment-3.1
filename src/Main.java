import java.util.Scanner;

public class Main {
    private static final int ENTRIES_PER_LINE = 10;
    private static int COUNT_TO;
    private static final int[] MULTIPLE_CHECKERS = {3, 5}; //removing 15 bc that be dumb
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int prints = 0;
        System.out.print("This program will only be printing multiples of ");
        for (int multipleChecker : MULTIPLE_CHECKERS) {
            System.out.print(multipleChecker + " ");
        }
        System.out.println("\nTo what number should the program count to? (Please enter a Integer):");
        COUNT_TO = scanner.nextInt();
        for (int i = 0; i <= COUNT_TO; i++) {
            for (int multiple : MULTIPLE_CHECKERS) {
                if(i % multiple == 0) {
                    prints++; // increment the prints here so zero is put on the first line with another 9 digits. 0 is a multiple of anything, so shit will print on its own line otherwise.
                    if(prints % ENTRIES_PER_LINE == 0) System.out.println(i);
                    else System.out.print(i + "\t");
                    break; // not gonna continue the loop for the other ones multiple checks because we have already wrote to console.
                }
            }
        }
    }
}
