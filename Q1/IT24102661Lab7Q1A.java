import java.util.Scanner;

public class IT24102661Lab7Q1A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] marks = new int[4];  
        int total = 0;              

        
        for (int i = 0; i < 4; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();  
            total += marks[i];  
        }

        
        double average = total / 4.0;  

        
        String grade;
        if (average >= 75) {
            grade = "Distinction";
        } else if (average >= 50) {
            grade = "Credit";
        } else {
            grade = "Fail";
        }

        
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
        System.out.println("Grade: " + grade);

        scanner.close();  
    }
}
