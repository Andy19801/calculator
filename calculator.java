import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // each subject
        System.out.println("Enter marks obtained (out of 100) in each subject:");
        int[] marks = new int[5]; 
        //  5 subjects

        for (int i = 0; i < marks.length; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        // Calculate Total Mark
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }

        //  Average Percentage
        double averagePercentage = (double) totalMarks / marks.length;

        // Grade Calculator
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        //  Results
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
    }
}
