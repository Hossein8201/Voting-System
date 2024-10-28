import java.util.*;
/**
 * <h1>Create a Vote</h1>
 * In this class, We create a vote with information of voter and date.
 * <p>
 * @author Hossein Tatar - 40133014
 * @version 1.0
 * @since 2024-10-28
 */
public class Vote {
    /*
    First we define the fields and constructor as follows:
    */
    /** <b>voter</b> is an object of Person class.<p>
     * <b>note:</b> we don't need to change the value of that, Thus we define it <i>final</i>. */
    private final Person voter;
    /** <b>date</b> is a String type.<p>
     * <b>note:</b> we don't need to change the value of that, Thus we define it <i>final</i>. */
    private final String date;
    /**
     * <h3>Constructor of votes</h3>
     * This method creates an object of Vote class and initialized that.
     * @param voter is an object of Person class.
     * @param date is a String type of input value.
     * @return nothing
     */
    public Vote(Person voter, String date) {
        this.voter = voter;
        this.date = date;
    }
     /*
    Next we need to use getter methods to access the value of private variables.
    We don't need to setter methods because we don't want to change the value of fields.
    */
    /** Getter method to get the value of voter parameter.
     * @return an object of Person class that is information of person. */
    public Person getVoter() {return voter;}
    /** Getter method to get the value of date parameter.
     * @return a String type that is date of vote. */
    public String getDate() {return date;}
    /**
     * <h3>Override of Equals method</h3>
     * This method check the votes together to be sure no person <b>don't voted twice</b>.
     * @param o is an object.
     * @return is a boolean type that show us the vote is repetitive or not.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vote vote = (Vote) o;
        return Objects.equals(voter, vote.voter) && Objects.equals(date, vote.date);
    }
    /**
     * <h3>Override of hashcode method </h3>
     * This method transform the fields to hash codes to make the <b>accessibility faster</b>.
     * @return is a int type that is hash code of the fields.
     */
    @Override
    public int hashCode() {
        return Objects.hash(voter, date);
    }
}
