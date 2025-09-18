import java.util.Scanner;

public class InputHandler {
    private final Scanner scanner = new Scanner(System.in);

    public String getStringInput() {
        while (true) {
            String input = scanner.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("Empty input. Try again!");
            } else {
                return input;
            }
        }
    }

    public int getIntInput() {
        while(true) {
            String input = scanner.nextLine().trim();

            if(input.isEmpty()) {
                System.out.println("Empty input. Try again!");
            } else {
                try {
                    return Integer.parseInt(input);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter an integer.");
                }
            }
        }
    }

    public int getIntInput(int min, int max) {
        while(true) {
            int i = getIntInput();

            if(i <= max && i >= min) {
                return i;
            }

            System.out.printf("Invalid input. Pick a number from %d to %d%n", min, max);
        }
    }
}
