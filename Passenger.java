public class Passenger extends Person{

    private String phone_number;
    
    public Passenger(String FirstName, String LastName,String phone_number) {
        super(FirstName, LastName);
        this.phone_number = phone_number;
    }

    public String getPhone_number() {
        return phone_number;
    }
    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }


    public void isCalling(String car, String car_model, String type){
        System.out.println("A potential client with phone number "+phone_number + " is calling to get an offer about the price " + car_model + " " + type + ".\n");
    }
    public void getsToDestination(String LastName ,String car_model, String car_color , String FirstName) {
        System.out.println("Customer " +getLastName() + " is waiting for the " +car_color +" "+ car_model+ " and the driver " + getFirstName()+" \n");
    }
}