import java.util.*;
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
    /**
     * <h3>Constructor of voting class</h3>
     * This method creates an object of voting class and initialized that with the given values.
     * @param type is an int and show us the mode of voting.
     * @param question is a String type.
     * @param isAnonymous is a boolean type and tell us the status of visibility.
     * @return nothing
     */
    public Voting(int type, String question, boolean isAnonymous) {
        this.type = type;
        this.question = question;
        this.isAnonymous = isAnonymous;
        this.choices = new HashMap<String, HashSet<Vote>>();
        this.voters = new ArrayList<Person>();
    }
    /*
    Next we need to use getter and setter to apply the changes for some private variables.
    In here, We need to define that just for question field.
    */
    /** Getter method to get the value of question parameter.
     * @return String type that is question of voting. */
    public String getQuestion() {return question;}
    /** Setter method to change the value of question.
     * @param question is input variable that show us the new question of voting.
     * @return nothing */
    public void setQuestion(String question) {this.question = question;}
    /**
     * <h3>Get the choices of voting</h3>
     * This method create an ArrayList of choices of voting options from the keys of HashMap.
     * @return is an ArrayList of String type member.
     */
    public ArrayList<String> getChoices() {
        ArrayList<String> choicesOfVoting = new ArrayList<>(choices.keySet());
        return choicesOfVoting;
    }
    /**
     * <h3>Add a new voting option</h3>
     * This method receives a string in its input parameter and add it to the voting options.
     * @param choice is a String type of input value.
     * @return nothing
     */
    public void createChoices(String choice) {choices.put(choice,null);}
    /**
     * <h3>Voting method for not anonymous mode</h3>
     * This method for the mode where voting <b>is not anonymous</b> and the input parameters of this method includes the voter and his chosen options.
     * @param voter is an object of Person class that participated in voting.
     * @param voterChoices is an ArrayList of chosen options of voting.
     * @return nothing
     */
    public void vote(Person voter, ArrayList<String> voterChoices) {}
    /**
     * <h3>Voting method for anonymous mode</h3>
     * This method for the mode where voting <b>is anonymous</b> and the input parameter of this method is person who participated in voting.<p>
     * <b>note:</b> A random option should be generated and selected.
     * @param person is an object of Person class that participated in voting.
     * @return nothing
     */
    public void vote(Person person){}
    /**
     * <h3>Print the result of voting</h3>
     * This method prints the result of voting, including voting options and the number of votes for each option.
     * @return nothing
     */
    public void printResults() {
        for (String choice : choices.keySet()) {
            System.out.println(choice + " : " + choices.get(choice).size());
        }
    }
    /**
     * <h3>Print the voters</h3>
     * If the voting was not anonymous, the voting options and all the people who voted for that option will be printed.
     * @return nothing
     */
    public void printVoters() {
        if (isAnonymous)    return;     // Check the condition of isAnonymous was not 1.
        for (String choice : choices.keySet()) {
            System.out.println(choice + " : Persons who voting to this choice includes:");
            for (Vote vote : choices.get(choice)) {
                System.out.print(vote.getVoter() + " ");
            }
        }
    }
}
