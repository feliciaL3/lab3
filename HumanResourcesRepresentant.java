public class HumanResourcesRepresentant extends Person {
    
 
  public HumanResourcesRepresentant ( String FirstName, String LastName) {
    super (FirstName, LastName);
  }
    
    public void hiring(){
        System.out.printf("Employer %s %s is searching for new drivers.\n", getFirstName() , getLastName ());
    }

}