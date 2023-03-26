public class PolicyHolder {
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;
    private double height;
    private double weight;

    public PolicyHolder() {
        firstName = "";
        lastName = "";
        age = 0;
        smokingStatus = "non-smoker";
        height = 0;
        weight = 0;
    }

    public PolicyHolder(String firstNameI, String lastNameI, int ageI,
                        String smokingStatusI, double heightI, double weightI) {
        firstName = firstNameI;
        lastName = lastNameI;
        age = ageI;
        smokingStatus = smokingStatusI;
        height = heightI;
        weight = weightI;
    }

    public PolicyHolder(PolicyHolder policyHolderI) { //copy of policyholder object
        firstName = policyHolderI.firstName;
        lastName = policyHolderI.lastName;
        age = policyHolderI.age;
        smokingStatus = policyHolderI.smokingStatus;
        height = policyHolderI.height;
        weight = policyHolderI.weight;
    }
    
    //setters and getters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName2) {
        firstName = firstName2;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName2) {
        lastName = lastName2;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age2) {
        age = age2;
    }

    public String getSmokingStatus() {
        return smokingStatus;
    }

    public void setSmokingStatus(String smokingStatus2) {
        smokingStatus = smokingStatus2;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height2) {
        height = height2;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight2) {
        weight = weight2;
    }
      
    //toString method
    public String toString() {
        return "First Name: " + firstName + "\n" +
                "Last Name: " + lastName + "\n" +
                "Age: " + age + "\n" +
                "Smoking Status: " + smokingStatus + "\n" +
                String.format("Height: %.2f inches\n", height) +
                String.format("Weight: %.2f pounds\n", weight); //unsure of if string.format was discussed in the book or not but I learned it from online. 
    }
}
