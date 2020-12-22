class Student{
    int rollno;//instance variable
    String name;
    static String college ="HiveTech";//static variable

    //constructor
    Student(int r, String n){
        rollno = r;
        name = n;
    }
    //method to display the values
    void display (){System.out.println(rollno+" "+name+" "+college);}
}

public class TestStaticVariable1{
    public static void main(String args[]){
        Student s1 = new Student(111,"Tu");
        Student s2 = new Student(222,"Huan");

        //Student.college="HiveTech";
        s1.display();
        s2.display();
    }
}
