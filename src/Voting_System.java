public class Voting_System {
    // Created variables to hold data;
    static String victory;
    static int highestVote = 0;
    static String errorVote;
    static int pDp_Votes = 0;
    static int aPc_Votes = 0;
    static int unregistered_Votes = 0;
    static String newline = System.lineSeparator();

    // Created a Method that accepts an array as data and returns a String statement
    static void votingSystem(String[] party){
        // Created a for loop that loops through the array and counts the number of repeated cases
        for (int i = 0; i < party.length; i++){
            String candidate = party[i].toLowerCase();
            if (candidate == "pdp"){
                pDp_Votes +=1;
            } else if (candidate == "apc"){
                aPc_Votes +=1;
            } else {
                unregistered_Votes +=1;
            }
        }
        // An if statement that checks the outputed results of the candidate and returns to the victory variable a concatinated sting of results
        if (pDp_Votes > aPc_Votes && pDp_Votes > unregistered_Votes){
            highestVote = pDp_Votes;
            victory = "The winner of the election is The people Democratic party with a total vote of " + highestVote + newline +
                    " The All Progressive party came second with a total vote of " + aPc_Votes + newline + " And there were " + unregistered_Votes + " Unregistered Votes.";
        } else if (aPc_Votes > pDp_Votes && aPc_Votes > unregistered_Votes){
            highestVote = aPc_Votes;
            victory = "The winner of the election is All Progressive Party with a total vote of " + highestVote + newline +
                    " The People democratic party came second with a total vote of " + pDp_Votes + newline + " And there were " + unregistered_Votes + " Unregistered Votes.";
        } else if (pDp_Votes == aPc_Votes) {
            errorVote = "There was a tie between both parties";
            victory = errorVote + " with a cummulated vote of " + pDp_Votes + " for PDP and " + aPc_Votes + " for APC";
        } else if (unregistered_Votes > aPc_Votes && unregistered_Votes > pDp_Votes){
            errorVote = "The Outcome of the result is invalid";
            victory = errorVote;
        }
        // print out result
        System.out.println(victory);
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void main(String[] args){
        String[] vote_Data = {"apc", "pdp", "apc", "apc", "apc", "apc", "apc", "pdp", "pdp", "apga", "apga", "apga", "apga", "apga", "pdp"};
        votingSystem(vote_Data);
    }
}
