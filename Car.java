public class Car  extends CompanyComponents{
    private String car_model;
    private String car_type;
    private String car_color;

    public Car(String car_model, String car_type, String car_color){
        this.car_model = car_model;
        this.car_type = car_type;
        this.car_color = car_color;
    }


    public void setcar_model(String car_model) {
        this.car_model = car_model;
    }
    public void setCarType(String car_type) {
        this.car_type = car_type;
    }
    public void setcar_color(String car_color){
        this.car_color = car_color;
    }

    public String getCarType() {
        return car_type;
    }
    public String getcar_model() {
        return car_model;
    }
    public String getcar_color() {
        return car_color;
    }


    public void isFree(){
        System.out.println("\n"+car_model + " " + car_color +" is free right now.\n");
    } 

    public void isDamaged(){
        System.out.println(car_model + " " + car_color+"  is in an accident\n");
    }

    public void isFull(){
        System.out.println(car_model + " " + car_color + " is full\n");
    }
    public void isParking(){
        System.out.println(car_model + " " + car_color + " is parking.\n");
    }

}