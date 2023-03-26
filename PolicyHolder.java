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
}
