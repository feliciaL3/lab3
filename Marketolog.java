public class Marketolog extends Person {
    
    public Marketolog(String FirstName, String LastName) {
        super(FirstName, LastName);
    }
 
   public void promovates() {
    System.out.println("The marketolog " + getFirstName() + " " + getLastName() + " makes different offers for loyal customers\n");
}
}