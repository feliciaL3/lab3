public class CustomerServiceRepresentant extends Person {
   
    public CustomerServiceRepresentant(String FirstName, String LastName) {
        super(FirstName, LastName); 
    }

    public void answerToCalls(String passenger, String phone_number){
        System.out.println("The dispatcher " + getFirstName() +" " + getLastName() + " answers to " + phone_number + "  and try to find a free car for the customer.\n ") ;
    }
}