package Try;

public class StudentInfo { // Goal: Constructor parameterization

    String studentname;
    String studentcity;
    int studentage;

    public StudentInfo (String name, String city, int age){  //Constructor parameterization
        System.out.println("Constructor with parameters");
        studentname = name;
        studentcity = city;
        studentage = age;
    }
    public static void main(String[] args) {
        StudentInfo studentInfo = new StudentInfo("lyes", "NewYork", 100);
        System.out.println(studentInfo.studentname);
        System.out.println(studentInfo.studentcity);
        System.out.println(studentInfo.studentage);
    }

}
