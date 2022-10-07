public class PartnershipRepresentant extends Person {
    String companyname;
    int Number_Employee;
    
     public PartnershipRepresentant (String FirstName, String LastName, int  Number_Employee, String companyname){
     super(FirstName, LastName);
     this.companyname=companyname;
     this.Number_Employee =Number_Employee;
     }

    public String getCompanyName() {
        return companyname;
    }
    public int getNumber_Employee() {
        return Number_Employee;
    }
    
 

    public void setCompanyName(String companyname) {
        this.companyname = companyname;
    }
    public void setNumber_Employee(int Number_Employee) {
        this.Number_Employee = Number_Employee;
    }
    public void colaborate (){
        System.out.println(companyname + " wants to colaborate.\n");
    }
}