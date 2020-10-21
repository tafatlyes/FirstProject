public class Phone { // Goal: Constructor parameterization

        String model;

        public Phone() { //default Constructor

        }

        public Phone(String modelOfConstructor) { //Constructor parameterization
            this.model = modelOfConstructor;
        }

        public static void main(String[] args) {

            Phone phone1 = new Phone("iPhone");
            phone1.printPhone();
        }

        public void printPhone() {
            System.out.println(model);
        }
    }

