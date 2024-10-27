/**
 * <h1>Create a person</h1>
 * In this class we create a person by Firstname and Lastname to can participate in Vote system.
 * <p>
 * @author Hossein Tatar - 40133014
 * @version 1.0
 * @since 2024-10-28
 */
public class Person {
    /*
    First we define the variables as follows:
    */
    /** <b>firstName</b> is a String type. */
    private String firstName;
    /** <b>lastName</b> is a String type. */
    private String lastName;
    /**
     * <h3>Constructor method of Persons</h3>
     * This method creates an object of Person class and initial it.
     * @param firstName is a String type of input Value.
     * @param lastName is a String type of input value.
     * @return nothing
     */
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    /*
    Next we need to use getter and setter to apply the changes for private variables
    */
    /** Getter method to get the value of firstName parameter.
     * @return a String type that is firstName of person. */
    public String getFirstName() {return firstName;}
    /** Getter method to get the value of lastName parameter.
     * @return a String type that is lastName of person. */
    public String getLastName() {return lastName;}
     /*
    Now we identify the Setter methods.
    */
    /** Setter method to change the value of firstName.
     * @param firstName is a String type of input value.
     * @return nothing */
    public void setFirstName(String firstName) {this.firstName = firstName;}
    /** Setter method to change the value of lastName.
     * @param lastName is a Stirng type of input value.
     * @return nothing */
    public void setLastName(String lastName) {this.lastName = lastName;}
}
