import java.util.*;
/**
 * <h1>Handling the voting process</h1>
 * This class is responsible for managing all changes and processes of voting.
 * @author Hossein Tatar - 40133014
 * @version 1.0
 * @since 2024-10-28
 */
public class VotingSystem {
    /*
    First we define the fields and constructor as follows:
    */
    /** <b>votingList</b> is an ArrayList of Voting class objects that store the voting. */
    private ArrayList<Voting> votingList;
    /**
     * <h3>Constructor method of votingSystem</h3>
     * This method creates an object of VotingSystem class and initialized that, We dont need to input.
     * @return nothing
     */
    public VotingSystem() {
        this.votingList = new ArrayList<Voting>();
    }
}
