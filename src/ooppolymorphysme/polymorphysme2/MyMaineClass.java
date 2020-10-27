package ooppolymorphysme.polymorphysme2;

 class Bird {

    public void Sing(){
        System.out.println("tweet tweet");
    }
}
class Owls extends Bird {
    public void Sing() {
        System.out.println("hoo hoo");
    }
}

    class Parrot extends Bird {
        public void Sing() {
            System.out.println("whistles and squawks");
        }
    }

    public class MyMaineClass {

        public static void main(String[] args) {
            Owls o = new Owls();
            o.Sing();
        }
    }

