import java.util.Scanner;

public class EnumDaysExample {
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a day of the week (e.g., MONDAY): ");

        String input = scanner.nextLine().toUpperCase();

        try {
            Day today = Day.valueOf(input);

            System.out.println("You selected: " + today);
            Day today = Day.valueOf("FUNDAY");
            System.out.println("Today is: " + today);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: Invalid day entered!");
            System.out.println("Please enter a valid day like MONDAY, TUESDAY, etc.");
        }
            System.out.println("Invalid day! Please enter a valid day of the week.");

        scanner.close();
        } finally {
            System.out.println("This block always executes.");
        }
    }
}
