public class activity2 {
public class ArrayActivity {
    public static void main(String[] args) {

        int[] numbers = {10, 45, 3, 78, 32, 56};
        int[] scores = {72, 85, 90, 78, 99, 92, 88, 75, 82, 74};

        int max = numbers[0];
        System.out.println("First element: " + scores[0]);

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
        System.out.println("Last element: " + scores[9]);

        int min = scores[0];
        for (int score : scores) {
            if (score < min) {
                min = score;
            }
        }
        System.out.println("Lowest element: " + min);

        int max = scores[0];
        for (int score : scores) {
            if (score > max) {
                max = score;
            }
        }
        System.out.println("Highest element: " + max);

        System.out.println("Using for loop with index:");
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Index " + i + ": " + scores[i]);
        }

        System.out.println("Maximum value: " + max);
        System.out.println("\nUsing for-each loop (values only):");
        for (int score : scores) {
            System.out.println(score);
        }

        System.out.println("\n💻 Activity 3: Calculate the Average");

        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        double average = (double) sum / scores.length;

        System.out.println("Average score: " + average);
    }
}
