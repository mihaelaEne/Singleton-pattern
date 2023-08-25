public class Captain2 {
    // Early initialization
    private static final Captain CAPTAIN_INSTANCE =
            new Captain();
    // Making the constructor private
    // to prevent the use of "new"
    private Captain2() {
        System.out.println("\tNew captain is elected for your team.");
    }
    // Global point of access.
    public static Captain getCaptain(){
        System.out.println("\tYou already have a captain for your team.");
        System.out.println("\tSend him for the toss.");
        return CAPTAIN_INSTANCE;
    }
}
