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
}
