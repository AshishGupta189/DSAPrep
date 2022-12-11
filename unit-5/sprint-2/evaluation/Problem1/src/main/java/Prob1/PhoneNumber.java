package Prob1;



public class PhoneNumber{

    private int phoneId;
    private String phoneNumber;

    public PhoneNumber(int phoneId, String phoneNumber, String phoneType) {
        this.phoneId = phoneId;
        this.phoneNumber = phoneNumber;
        this.phoneType = phoneType;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "phoneId=" + phoneId +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", phoneType='" + phoneType + '\'' +
                '}';
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


    public int getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(int phoneId) {
        this.phoneId = phoneId;
    }



    public PhoneNumber() {
    }

    public PhoneNumber(String phoneNumber, String phoneType) {
        this.phoneNumber = phoneNumber;
        this.phoneType = phoneType;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(String phoneType) {
        this.phoneType = phoneType;
    }

    private String phoneType;

}
