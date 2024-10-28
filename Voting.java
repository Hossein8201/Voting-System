/**
 * <h1>Voting properties</h1>
 * In this class, We define many options and types for voting.
 * <p>
 * @author Hossein Tatar - 40133014
 * @version 1.0
 * @since 2024-10-28
 */
public class Voting {
    /*
    First we define the fields and constructor as follows:
    */
    /** <b>type</b> is an int that show us the <i>Voting Mode</i> specifies single vote or multiple votes.<p>
     * <b>note:</b> 0 means single and 1 means multiple votes. */
    private int type;
    /** <b>question</b> is a String type. */
    private String question;
    /** <b>choices</b> is a HashMap type that show us the <i>Voting Options</i>.<p>
     * <b>note:</b> the String keys of that, Indicates a voting option and the value of them is a HashSet of given votes. */
    private HashMap<String, HashSet<Vote>> choices;
    /** <b>isAnonymous</b> is a boolean type and tell us the voting is Anonymous or not with 0 and 1. */
    private boolean isAnonymous;
    /** <b>voters</b> is an ArrayList of Person class objects that show us People who participated in voting. */
    private ArrayList<Person> voters;
}
