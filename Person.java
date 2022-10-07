public class Person  extends CompanyComponents{
    private String FirstName;
    private String LastName;

     public Person (String FirstName, String LastName) {
        this.FirstName = FirstName;
        this.LastName = LastName;
     }


     public String getFirstName() {
      return FirstName;
      }
     public String getLastName(){
      return LastName;
    }


     private void  FirstNameLastName (){
        System.out.printf( "%s%s %n  " , FirstName, LastName  );
     }
      public void setFirstName() {
        this.FirstName = FirstName;
     }
     public void setLastName() {
        this.LastName = LastName;
     }
}
