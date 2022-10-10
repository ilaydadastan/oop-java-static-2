public class Person {
    private String firstName;
    private String lastName;
    private String telNo;

    public Person(String firstName, String lastName, String telNo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.telNo = telNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }
    public String getFullName(){
        return firstName + " " + lastName;
    }
    public String getInfo(){
        return  getFullName() + " " + getTelNo();
    }

    public static String getClassName(){
        return "Person";
    }
}


