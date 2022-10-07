public class Dispatcher extends Person{
  
    String phone_number;

    public Dispatcher(String FirstName, String LastName) {
        super(FirstName, LastName);
    }
    public String getPhone_number() {
        return phone_number;
    }
    public void setPhone_Number (String phone_number){
        this.phone_number = phone_number;
    }

    
    public void contactingDriver(){
        System.out.println(getFirstName() + " "+ getLastName()+ " is now contacting the driver\n");
    }

}