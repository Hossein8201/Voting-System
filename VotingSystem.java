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
    /**
     * <h3>Create a new voting</h3>
     * This method creates a new voting and append the values to it.
     * @param question is a String type of input value.
     * @param isAnonymous is a boolean type that show us the status of visibility.
     * @param type is an int and the mode of how many times a person can vote.
     * @param choices is an ArrayList of String types that show the voting options.
     * @return nothing
     */
    public void createVoting(String question, boolean isAnonymous, int type, ArrayList<String> choices) {
        Voting voting = new Voting(type, question, isAnonymous);
        for (String choice : choices) {
            voting.createChoices(choice);
        }
        votingList.add(voting);
    }
    /**
     * <h3>Find a voting</h3>
     * According to the argument, it finds the desired voting index in the votingList.
     * @param index is an int type that is argument
     * @return is an object of Voting class that argument refer to.
     */
    public Voting getVoting(int index) {return votingList.get(index);}
    /** Getter method to get the value of votingList.
     * @return is an ArrayList that every member are an object of Voting class. */
    public ArrayList<Voting> getVotingList() {return votingList;}
    /**
     * <h3>Print the result</h3>
     * It prints the final voting result with given index number.
     * @param index is an int value that show us what argument must print.
     * @return nothing
     */
    public void printResults(int index) { votingList.get(index).printResults();}
    /**
     * <h3>Print the list of voters</h3>
     * This method prints the list of voters for voting with given argument.
     * @param index is an int value that show us what argument must print its voters.
     * @return nothing
     */
    public void printVoters(int index) { votingList.get(index).printVoters();}
    /**
     * <h3>Print the information of voting</h3>
     * This method prints the question and the options of each voting.
     * @param index is an int value that show us what argument must print its information.
     * @return nothing
     */
    public void printVoting(int index) {
        System.out.println("The question of voting is : "+ votingList.get(index).getQuestion() + " and it choices: ");
        System.out.println(votingList.get(index).getChoices());
    }
}
