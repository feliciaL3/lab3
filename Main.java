public class Main {
  public static void main(String[] args) {

      // create driver objects
      Driver driver1 = new Driver("Vasile", "Seen", 24, 2, true, true,false );
      Driver driver2 = new Driver("Taylor", "Teamt", 33, 5,true,false,true);
      Driver driver3 = new Driver("John", "Carl",21, 1, true,false,true);
      Driver driver4 = new Driver("Sam", "Black",50,21,true,true,true);

      // create passenger objects
      Passenger passenger1 = new Passenger("Max", "Bont", "0545435343");
      Passenger passenger2 = new Passenger("Mike", "Corn", "035243234");
      Passenger passenger3 = new Passenger("Helsa", "Mike","0129839293");

     // create car objects
      Car car1 = new Car("Renault", "hybrid", "blue");
      Car car2 = new Car("Audi", "electric", "black");
      Car car3 = new Car("Toyota", "electric" , "blue");
      Car car4 = new Car("Dacia", "hybrid", "white");
      // car method
      car1.isFree();
      car2.isDamaged();
      car3.isFull();
      car4.isParking();

      // create humanresreprest object
      HumanResourcesRepresentant HumanResourcesRepresentant = new HumanResourcesRepresentant("Maria", "Moon");
      HumanResourcesRepresentant.hiring();
    // initialize methods for drivers
      driver1.isBusy();
      driver2.isAtPause();
      driver3.isWaiting();
      driver4.isWaiting();

      // mechanic
      Mechanic mechanic = new Mechanic("John", "Bon", "032243424", 35);
      mechanic.repairs(car2.toString(), car2.getcar_model(), car2.getCarType());
       
      // accountant
      Accountant Accountant = new Accountant("Mya", "Jhonson", "Salary");
      Accountant.manages();

      driver1.isDriving(String.valueOf(car1), car1.getcar_model(), car1.getCarType());
      driver2.isDriving(String.valueOf(car2), car2.getcar_model(), car2.getCarType());
      driver3.isDriving(String.valueOf(car3), car3.getcar_model(), car3.getCarType());

      // marketolog
      Marketolog marketolog = new Marketolog("Jan", "Morse");
      marketolog.promovates();

        // create operator object
        CustomerServiceRepresentant operator1 = new CustomerServiceRepresentant("Gode", "Brown");
        CustomerServiceRepresentant operator2 = new CustomerServiceRepresentant("Sasha", "Slet");
        
        // operator method
        operator1.answerToCalls(passenger1.toString(), passenger1.getPhone_number());
        operator2.answerToCalls(passenger2.toString(), passenger2.getPhone_number());

        // initialize method for passenger
        passenger1.isCalling(car1.toString(), car1.getcar_model(), car1.getCarType());
        passenger2.waits(passenger2.getLastName(),car1.getcar_model(), car1.getcar_color() ,driver1.getFirstName());
        passenger3.isCalling(car1.toString(), car4.getcar_model(), car4.getCarType());


  }

}