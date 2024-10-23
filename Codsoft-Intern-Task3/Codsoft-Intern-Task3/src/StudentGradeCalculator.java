import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the number of subjects
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();
        
        // Declare variables
        int totalMarks = 0;
        int[] marks = new int[numSubjects];
        
        // Take marks as input for each subject
        for (int i = 0; i < numSubjects; i++) {
            int subjectMarks;
            // Validate input to be 100 or less
            do {
                System.out.print("Enter marks obtained in subject " + (i + 1) + " (out of 100): ");
                subjectMarks = scanner.nextInt();
                
                if (subjectMarks < 0 || subjectMarks > 100) {
                    System.out.println("Invalid input! Marks must be between 0 and 100.");
                }
            } while (subjectMarks < 0 || subjectMarks > 100);
            
            marks[i] = subjectMarks;
            totalMarks += subjectMarks;
        }
        scanner.close();

        // Calculate average percentage
        double averagePercentage = (double) totalMarks / numSubjects;
        
        // Determine the grade
        String grade;
        if (averagePercentage >= 90) {
            grade = "A";
        } else if (averagePercentage >= 80) {
            grade = "B";
        } else if (averagePercentage >= 70) {
            grade = "C";
        } else if (averagePercentage >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        
        // Display results
        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
    }
}
