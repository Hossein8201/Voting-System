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

}
