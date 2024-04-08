public class Student {
    // initiate the variables first name last name and major
    private String firstName;
    private String lastName;
    private String major;
    // initiate the constructor for the student class
    public Student(String firstName, String lastName, String major) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
    }
    // get name methode
    public String getName() {
        return firstName + " " + lastName;
    }
//hash code methode for the student class
    @Override
    public int hashCode() {
        int numb = 31;// Prime number used for generating the hash code
        int code = 1; // Initial hash code value
        // Combines the hash codes of the fields using the prime number multiplier
        code = numb * code + firstName.hashCode();
        code = numb * code + lastName.hashCode();
        code = numb * code + major.hashCode();
        // Return the final hash code
        return code;
    }
}