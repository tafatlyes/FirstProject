package practice;

public class Car {  //Methods parameterization

    public static void main(String[] args) {
        Car car = new Car();
        car.Mycar();
        car.Mycar("Toyota");
        car.Mycar("Toyota", "Gray");
        car.Mycar("Toyota", "Gray", 10000);
        car.Mycar("Toyota", "Gray", 10000, 30000);


    }

    public static void Mycar(){
        System.out.println("The number of cars I have is " + 1);
    }

    public void Mycar(String brand){
        System.out.println("My car's brand is a "+brand);
    }
    public void Mycar(String brand, String color){
        System.out.println("My car's brand is a "+brand+ " and its color is "+color);
    }
    public void Mycar(String brand, String color, int mileage){
        System.out.println("My car's brand is a "+brand+ " and its color is "+color+ " with a mileage of "+mileage);
    }
    public void Mycar(String brand, String color, int mileage, int price){
        System.out.println("My car's brand is a "+brand+ " and its color is "+color+ " with a mileage of "+mileage+ "and a price of "+price);
    }
}



