public class Operators {

    public static void main(String [] args){
        System.out.println ("Operators review");

        int totalAmount = 234; //Camel case convention for totalAmount
        int TotalAmount = 134; //Java is a case sensitive language, so totalAmount and TotalAmount are
                               // different

        int player1Score = 99;
        int player2Score = 75;
        int player3Score = 21;

        // Arithmetic Operators
        System.out.println(totalAmount + TotalAmount);
        System.out.println(totalAmount - TotalAmount);

        // Relational Operators/ Comparative Operators
        System.out.println(totalAmount < TotalAmount); //boolean output for relational operator

        // Logical Operators
        // AND (&&) using ampersands ____ True if both cases are true
        // OR (||)  True if only anyone is true
        // NOT (!)

        // Example of AND operator
        System.out.println(player1Score > player2Score && player1Score> player3Score);


        // Example of OR operator
        boolean ifPremiumMember = false;
        boolean ifAdmin = true;
        System.out.println("Does user has access to the premium feature: " + (ifPremiumMember || ifAdmin));

        // Example of NOT operator

        boolean isAuthenticated = true;
        System.out.println("Inverse of isAuthenticated: "+ (!isAuthenticated));
    }
}
