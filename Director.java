public class Director  extends Person {
  

    public Director(String FirstName, String LastName) {
        super(FirstName, LastName);
    }
    public void OwnsBusiness(){
        System.out.println(getFirstName() + " " + getLastName() + " is owning a taxy company\n");
    }
}