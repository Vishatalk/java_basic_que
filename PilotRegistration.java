import java.util.Scanner;

public class PilotRegistration {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

       
        System.out.println("Please enter your details:");

        System.out.print("Enter your name: ");
        String name = scn.nextLine();

       

        int age = 0;
        boolean validAge = false;
        while (!validAge) {
            System.out.print("Age: ");
            if (scn.hasNextInt()) {
                age = scn.nextInt();
                if (age < 20 || age>60 ) {
                    System.out.println("wrong age Age must be 20 or above and less than 60");
                } else {
                    validAge = true;
                }
            } else {
                System.out.println("Invalid age. Please enter a valid age.");
                scn.nextLine(); 
            }
        }

        System.out.print("Handicapped (yes/no): ");
        String handicappedInput = scn.next();
        boolean handicapped = false;
        if (handicappedInput.equalsIgnoreCase("yes")) {
            handicapped = true;
        }

        System.out.print("Eye Condition (good/bad):");
        String eyeCondition = scn.next();

        int experience = 0;
        boolean validExperience = false;
        while (!validExperience) {
            System.out.print("Experience (in years): ");
            if (scn.hasNextInt()) {
                experience = scn.nextInt();
                validExperience = true;
            } else {
                System.out.println("wrong  Please enter a valid number of years.");
                scn.nextLine();
            }
        }

        System.out.println("\nRegistration Successful!");
        System.out.println(" your Name: " + name);
        System.out.println(" your Age: " + age);
        System.out.println("Handicapped: " + (handicapped ? "Yes" : "No"));
        System.out.println("Eye Condition: " + eyeCondition);
        System.out.println("Experience: " + experience + " years");


    }
}