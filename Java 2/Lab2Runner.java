public class Lab2Runner{
    public static void main(String[] args){
        Car x = new Car("Car1", 10.5, 60);
        Car y = new Car("Car2", 30.0, 15.5, 60);
        Car z = new Car("Car1", 10.5, 60);

        System.out.println(y);
        y.accelerate(50);
        System.out.println(y);
        y.accelerate(100);
        System.out.println(y);

        System.out.println(x.equals(z));
    }
}