import java.util.Scanner;

public class Project_Saad_Ahmad {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        //prompt for inputs
        System.out.print("Please enter the Policy Number: ");
        String policyNumber = scnr.nextLine();

        System.out.print("Please enter the Provider Name: ");

        String providerName = scnr.nextLine();

        System.out.print("Please enter the Policyholder's First Name: ");
        String firstName = scnr.nextLine();

        System.out.print("Please enter the Policyholder's Last Name: ");
        String lastName = scnr.nextLine();

        System.out.print("Please enter the Policyholder's Age: ");
        int age = scnr.nextInt();

        System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
        scnr.nextLine(); // fix new line character bug
        String smokingStatus = scnr.nextLine();

        System.out.print("Please enter the Policyholder's Height (in inches): ");
        double height = scnr.nextDouble();

        System.out.print("Please enter the Policyholder's Weight (in pounds): ");
        double weight = scnr.nextDouble();

        // policy object to use inputed information
        Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);

        // Display the information
        System.out.println("\nPolicy Number: " + policy.getPolicyNumber());
        System.out.println("Provider Name: " + policy.getProviderName());
        System.out.println("Policyholder's First Name: " + policy.getFirstName());
        System.out.println("Policyholder's Last Name: " + policy.getLastName());
        System.out.println("Policyholder's Age: " + policy.getAge());
        System.out.println("Policyholder's Smoking Status: " + policy.getSmokingStatus());
        System.out.println("Policyholder's Height: " + policy.getHeight() + " inches");
        System.out.println("Policyholder's Weight: " + policy.getWeight() + " pounds");
        System.out.printf("Policyholder's BMI: %.2f\n", policy.calculateBMI());
        System.out.printf("Policy Price: $%.2f\n", policy.calculatePrice());
    }