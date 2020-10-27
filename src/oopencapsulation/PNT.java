package oopencapsulation;

public class PNT {

    public static void main(String[] args) {
        Student student = new Student();

        student.setIdOfStudent(25643);
        student.setNameOfStudent("Lyes");

        //
        //
        //
        //
        //

        System.out.println(student.getIdOfStudent());
        System.out.println(student.getNameOfStudent());
        //
        //
        //
        //
        NewHire newHire = new NewHire();
        newHire.setName("Adel");
        newHire.setIdnumber(215);
        System.out.println(newHire.getName());
        System.out.println(newHire.getIdnumber());

    }
}

