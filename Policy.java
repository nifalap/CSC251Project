public class Policy {
    private String policyNumber;
    private String providerName;
    private PolicyHolder policyHolder;

    // no-arg constructor
    public Policy() {
        policyNumber = "";
        providerName = "";
        policyHolder = new PolicyHolder();
    }

    // constructor that accepts arguments
    public Policy(String policyNumberI, String providerNameI, PolicyHolder policyHolderI) {
        policyNumber = policyNumberI;
        providerName = providerNameI;
        policyHolder = policyHolderI;
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

    public PolicyHolder getPolicyHolder() {
        return policyHolder;
    }

    public void setPolicyHolder(PolicyHolder policyHolder2) {
        policyHolder = policyHolder2;
    }

    public double calculateBMI() {
        return (policyHolder.getWeight() * 703) / (policyHolder.getHeight() * policyHolder.getHeight());
    }

    public double calculatePrice() {
        double price = 600.00;
        if (policyHolder.getAge() > 50) {
            price += 75;
        }
        if (policyHolder.getSmokingStatus().equals("smoker")) {
            price += 100;
        }
        double bmi = calculateBMI();
        if (bmi > 35) {
            price += (bmi - 35) * 20;
        }
        return price;
        
    }
    
    public String toString() {
      return "Policy Number: " + policyNumber + "\n" +
            "Provider Name: " + providerName + "\n" +
            "Policy Holder:\n" + policyHolder.toString() + "\n" +
            String.format("Policy Price: $%.2f, BMI: %.2f", calculatePrice(), calculateBMI()); //unsure on if we're allowed to use string.format, I don't recall for sure if it was mentioned in the book but I learned it online.
}

}
