import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Project_Saad_Ahmad {
    public static void main(String[] args) throws IOException {
        // Read policy information from input file
        ArrayList<Policy> policies = new ArrayList<Policy>();

        // Check if the input file exists
        File file = new File("PolicyInformation.txt");
        if (!file.exists()) {
            System.out.println("Unable to locate the file.");
            System.exit(0);
        }

        // Read the policy information from the input file
            Scanner inputFile = new Scanner(file);
            while (inputFile.hasNext()) {
                String policyNumber = inputFile.nextLine();
                String providerName = inputFile.nextLine();
                String firstName = inputFile.nextLine();
                String lastName = inputFile.nextLine();
                int age = inputFile.nextInt();
                inputFile.nextLine();
                String smokingStatus = inputFile.nextLine();
                double height = inputFile.nextDouble();
                double weight =inputFile.nextDouble();
                inputFile.nextLine();
            
                Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
                policies.add(policy);
               
                // Move to the next line
                if(inputFile.hasNext()) {
                inputFile.nextLine();
                }
            }
            
            inputFile.close(); //close the file


        // Display policy information and smoker/non-smoker count
            int smokerCount = 0;
            int nonSmokerCount = 0;
            for (Policy policy : policies) {
                System.out.println(policy.toString());
                if (policy.getSmokingStatus().equals("smoker")) {
                    smokerCount++;
                } else {
                    nonSmokerCount++;
                }
            }
            
            System.out.print("There were " + Policy.getNumPolicies() + " Policy objects created.");
            System.out.println("\nThe number of policies with a smoker is: " + smokerCount);
            System.out.println("The number of policies with a non-smoker is: " + nonSmokerCount);
            
    }
}