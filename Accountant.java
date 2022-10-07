public class  Accountant  extends Person {
     private String task;

     public Accountant(String FirstName, String LastName, String task) {
        super(FirstName, LastName);
        this.task= task;
    }
    public void manages(){
        
        if (task == "Salary") {
            System.out.println("The accountant "+getFirstName() + " " + getLastName() + " calculates the salary of employees of taxi comapany.\n");
        }
    }

    public String getTask() {
        return task;
    }
    public void setTask(String task) {
        this.task = task;
    }   
}