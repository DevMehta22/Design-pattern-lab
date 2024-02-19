package Structural_Patterns.FacadeElection;

import java.util.HashMap;
import java.util.Map;

// Subsystem classes
class VoterRegistrationSystem {
    private Map<String, String> registeredVoters;

    public VoterRegistrationSystem() {
        registeredVoters = new HashMap<>();
    }

    public void registerVoter(String name, String address) {
        registeredVoters.put(name, address);
        System.out.println("Registered new voter: " + name);
    }

    public boolean isVoterRegistered(String name) {
        return registeredVoters.containsKey(name);
    }
}

class BallotCreationSystem {
    protected String[] candidates;

    public BallotCreationSystem() {
        candidates = new String[]{"Candidate A", "Candidate B", "Candidate C"};
    }

    public void createBallot() {
        System.out.println("Ballot created with the following candidates:");
        for (int i = 0; i < candidates.length; i++) {
            System.out.println((i + 1) + ". " + candidates[i]);
        }
    }

    public boolean isValidCandidate(int candidateId) {
        return candidateId >= 1 && candidateId <= candidates.length;
    }
}

class VotingSystem {
    public void vote(int candidateId) {
        System.out.println("Vote casted for candidate with ID: " + candidateId);
        // Logic for casting vote
    }
}

class ResultTabulationSystem {
    private int[] voteCounts;

    public ResultTabulationSystem(int numCandidates) {
        voteCounts = new int[numCandidates];
    }

    public void tabulateVote(int candidateId) {
        voteCounts[candidateId - 1]++;
    }

    public void tabulateResults() {
        System.out.println("Election Results:");
        for (int i = 0; i < voteCounts.length; i++) {
            System.out.println("Candidate " + (i + 1) + ": Votes - " + voteCounts[i]);
        }
    }
}

// Facade class
class ElectionFacade {
    private VoterRegistrationSystem voterRegistrationSystem;
    private BallotCreationSystem ballotCreationSystem;
    private VotingSystem votingSystem;
    private ResultTabulationSystem resultTabulationSystem;

    public ElectionFacade() {
        this.voterRegistrationSystem = new VoterRegistrationSystem();
        this.ballotCreationSystem = new BallotCreationSystem();
        this.votingSystem = new VotingSystem();
        this.resultTabulationSystem = new ResultTabulationSystem(ballotCreationSystem.candidates.length);
    }

    public void registerVoter(String name, String address) {
        voterRegistrationSystem.registerVoter(name, address);
    }

    public void createBallot() {
        ballotCreationSystem.createBallot();
    }

    public void vote(int candidateId) {
        if (ballotCreationSystem.isValidCandidate(candidateId)) {
            votingSystem.vote(candidateId);
            resultTabulationSystem.tabulateVote(candidateId);
        } else {
            System.out.println("Invalid candidate ID.");
        }
    }

    public void tabulateResults() {
        resultTabulationSystem.tabulateResults();
    }
}

// Client code
public class facade_demo {
    public static void main(String[] args) {
        ElectionFacade facade = new ElectionFacade();

        // Simulating an election process
        facade.registerVoter("John Doe", "123 Main St");
        facade.createBallot();
        facade.vote(1);
        facade.vote(2);
        facade.vote(3);
        facade.tabulateResults();
    }
}
