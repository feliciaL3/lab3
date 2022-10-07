public class Driver extends Person  {
    private int age;
    private int driving_years; 
    private boolean isAmable;
    private  boolean isProfessionist;
    private  boolean hasGeographicalSkills;

    public Driver (String FirstName, String LastName, int age, int driving_years, boolean isAmable, boolean isProfessionist, boolean hasGeographicalSkiils) {
     super(FirstName, LastName) ;
     this.age                   = age;
     this.driving_years         = driving_years;
     this.isAmable              =isAmable;
     this.isProfessionist       =isProfessionist;
     this.hasGeographicalSkills = hasGeographicalSkiils;
    }
    
    public void setAge(int age) {
         this.age = age;
    }
    public void setDriving_Years(int driving_years) {
         this.driving_years = driving_years;
    }
    public void setisAmable(boolean isAmable) {
         this.isAmable = isAmable;
    }
    public void setisProfessionist(boolean isProfessionist) {
         this.isProfessionist = isProfessionist;
    }
    public void sethasGeographicalSkills(boolean hasGeographicalSkills) {
         this.hasGeographicalSkills = hasGeographicalSkills;
    }



    public int getAge() {
         return age;
    }
    public int getDriving_years() {
         return driving_years;
    }
    public boolean isAmable() {
         return isAmable;
    }
    public boolean isProfessionist() {
         return isProfessionist;
    }
    public boolean hasGeographicalSkiils() {
         return hasGeographicalSkills;
    }
    
    public void isDriving(String car, String car_model, String type   ){  
        System.out.println( "The driver " + getFirstName()+ " "  + " drives a " + type+ " " + car_model + ".\n");
   }
   public void isBusy(){
        System.out.println("\nThe driver " + getFirstName() + " " +getLastName()+ " is driving the car.\n");
   }
   public void isWaiting(){
        System.out.println("The driver " +getFirstName ()+ " " +getLastName() + " is waiting for a client\n");
   }
   public void isAtPause(){
        System.out.println( "The driver "+ getFirstName ()+ " " +getLastName()+ " is taking a pause.\n");
   }
}