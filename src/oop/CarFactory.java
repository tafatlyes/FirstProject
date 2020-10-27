package oop;

public class CarFactory {

    static class Car {
        boolean power;
        int speed;
        String color;

        void start() {
            power=true;
            speed =0;
            color = "blue";
            System.out.println("current state when start is: ");
            System.out.println("power is : "+power);
            System.out.println("speed is : "+speed);
            System.out.println("color is : "+color);
        }

        void stop() {
            power=false;
            speed =0;
            color = "blue";
            System.out.println("current state when strop is: ");
            System.out.println("power is : "+power);
            System.out.println("speed is : "+speed);
            System.out.println("color is : "+color);
        }

        void accelerate() {
            power=true;
            speed = 50;
            color = "blue";
            System.out.println("current state when accelerating is: ");
            System.out.println("power is : "+power);
            System.out.println("speed is : "+speed);
            System.out.println("color is : "+color);



        }

    }


    public static void main(String[] args) {
         Car c1 = new Car();
        c1.start();
        c1.stop();
        c1.accelerate();


    }
}
