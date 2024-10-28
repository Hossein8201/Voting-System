import java.util.*;
/**
 * <h1>Main body of program</h1>
 * In this class, We define objects of other classes of program and check it.
 * <p>
 * @author Hossein Tatar - 40133014
 * @version 1.0
 * @since 2024-10-28
 */
public class Main {
    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();

        ArrayList<String> choices = new ArrayList<>();
        choices.add("python");
        choices.add("java");
        choices.add("go");

        votingSystem.createVoting("which one of programming you like?", false, 1, choices);

        Person person1 = new Person("Hossein", "Tatar");
        Person person2 = new Person("Alireza", "Mokhtari");

        ArrayList<String> person1Choices = new ArrayList<>();
        person1Choices.add("python");

        votingSystem.getVoting(0).vote(person1, person1Choices);
        votingSystem.getVoting(0).vote(person2);

        votingSystem.printResults(0);
        votingSystem.printVoters(0);
    }
}

