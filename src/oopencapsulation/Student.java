package oopencapsulation; //The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users.
                        // To achieve this, you declare class variables/attributes as private,provide public get and set methods to access and update the value of a private variable


public class Student {

    private String nameOfStudent;
    private int idOfStudent;


    //Setter method for the name of the student
    public void setNameOfStudent(String nameOfStudent){
        this.nameOfStudent=nameOfStudent;
    }
    //getter method
    public String getNameOfStudent(){
        return nameOfStudent;
    }



   //Setter method for the id of the student
    public void setIdOfStudent(int idOfStudent){
        this.idOfStudent=idOfStudent;
    }
    //getter method
    public int getIdOfStudent(){
        return idOfStudent;
    }
}
