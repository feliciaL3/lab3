public class Mechanic extends Person {
    private String phone_number;
    private int age;

  
    public Mechanic (String FirstName, String LastName, String phone_number, int age) {
        super(FirstName, LastName);
        this.phone_number = phone_number;
        this.age = age; }

    public void setAge(int age) {
        this.age = age;
    }
    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
    public int getAge() {
        return age;
    }
    public String getPhone_number() {
        return phone_number;
    }
    public void repairs(String car, String car_model, String type) {
        System.out.println(getFirstName() +" " + getLastName() + " is working at  " + car_model + " " + type+".\n");
    }
   
}