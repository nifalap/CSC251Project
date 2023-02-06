public class Policy {
    private String policyNumber;
    private String providerName;
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;
    private int height;
    private int weight;

      //no arg constructor
    public Policy() {
        policyNumber = "";
        providerName = "";
        firstName = "";
        lastName = "";
        age = 0;
        smokingStatus = "non-smoker";
        height = 0;
        weight = 0;
    }

      //constructor that accepts arguments
    public Policy(String policyNumberI, String providerNameI, String firstNameI, String lastNameI, int ageI,
                  String smokingStatusI, int heightI, int weightI) {
        policyNumber = policyNumberI;
        providerName = providerNameI;
        firstName = firstNameI;
        lastName = lastNameI;
        age = ageI;
        smokingStatus = smokingStatusI;
        height = heightI;
        weight = weightI;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber2) {
        policyNumber = policyNumber2;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName2) {
        providerName = providerName2;
    }

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

    public int getHeight() {
        return height;
    }

    public void setHeight(int height2) {
        height = height2;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight2) {
        weight = weight2;
    }

    public double calculateBMI() {
        return (weight * 703) / (height * height);
    }

    public int calculatePrice() {
        int price = 600;
        if (age > 50) {
            price += 75;
        }
        if (smokingStatus.equals("smoker")) {
            price += 100;
        }
        double bmi = calculateBMI();
        if (bmi > 35) {
        price += (bmi - 35) * 20;
        }
         return price;
   }
}