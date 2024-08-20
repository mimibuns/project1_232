import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // array is made to hold students scores
        ArrayList<Integer> numbers = new ArrayList<>();

        // loop to allow the teacher to enter multiple assignment scores
        while (true) {
            Scanner scnr = new Scanner(System.in);
            System.out.println("Please enter name or press enter to stop:");
            String userName = scnr.nextLine();

            // ends code
            if (userName.isEmpty()) {
                break;
            }

            System.out.println("Please enter their score:");
            int userScore;

            // code will stop if no int was put in
            if (scnr.hasNextInt()){
                userScore = scnr.nextInt();
            } else {
                System.out.println("Invalid input");
                break;
            }

            // inputs gets stored into array
            numbers.add(userScore);

            // created an instance of the class student
            //using the input, sees what grade they get
            Student StuOne = new Student(userName, userScore);
            StuOne.calcGrade(userName, userScore);
        }
        //gets average and displays it
        int average = Student.calcAverage(numbers);
        Student.calcGrade("Average is " + average, average);
    }
}