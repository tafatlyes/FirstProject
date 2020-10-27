package oop;

public class Computers {

    static class LapTop1 {

        int ram;
        String screen;
        boolean power;

         void start() {
            ram = 12;
            screen = "the screen is on";
            power = true;
            System.out.println("when started, the ram is in use and = " + ram + ", " + screen + " and power is " + power);
        }

        void stop() {
            ram = 0;
            screen = "the screen is off";
            power = false;
            System.out.println("when stopped, the ram is not in use and = " + ram + ", " + screen + " and power is " + power);
        }
    }


    public static void main(String[] args) {
        LapTop1 l1 = new LapTop1();
        l1.start();
        l1.stop();

    }
}
