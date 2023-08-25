final class Captain {
    //este final, nu pot sa am subclass
    private static Captain captain;

    Captain() {
    }

    // Internally it uses locks on a class or an object to ensure that only one thread is accessing the data.
    // Depending on an implementation, you may see the use of synchronized methods as well as synchronized statements.
    public static synchronized Captain getCaptain() {
        // Lazy initialization--> technique that you use to delay the object creation process. The basic idea is that you should create the object only when it is truly required
        if (captain == null) {
            //If they see that the instance has not been created yet, each of them will try to create a new instance.
            // As a result, you may end up with multiple instances of the class.


            captain = new Captain();
            System.out.println("\nA new captain is elected for your team.");
        } else {
            System.out.println("\nYou already have a captain for your team.");
        }
        return captain;
    }
}
