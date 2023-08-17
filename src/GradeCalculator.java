import java.util.Scanner;
public class GradeCalculator {
	public GradeCalculator() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		int sum = 0;
		
		System.out.println("Enter Scores (type negative number to finish)");
		
		while(true) {
			int score = scanner.nextInt();
            
            if (score < 0) {
                break;
            } else if (score > 100) {
                System.out.println("Invalid score. Please enter a score between 0 and 100.");
                continue;
            }
            
            sum += score;
            count++;
            System.out.println("Enter Scores");
            System.out.println(count);
            System.out.println(sum);
		}
		scanner.close();
		
		if(count > 0) {
            double average = (double) sum / count;
            System.out.println("Average grade: " + average);
            
            if (average > 90) {
                System.out.println("Excellent Work!");
            } else if (average > 80) {
                System.out.println("Good Job!");
            } else if (average > 70) {
                System.out.println("Keep it up!");
            } else {
                System.out.println("Let's work hard to get those grades up!");
            }
        } else {
            System.out.println("No scores entered.");
        }
	}

}
