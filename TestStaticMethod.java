class Student1{
    int rollno;//instance variable
    String name;
    static String college ="HiveTech";//static variable
    //static method to change the value of static variable
    static void change(){
        college = "NEW_HIVE_TECH";
    }
    //constructor
    Student1(int r, String n){
        rollno = r;
        name = n;
    }
    //method to display the values
    void display (){System.out.println(rollno+" "+name+" "+college);}
}
//Test class to create and display the values of object
public class TestStaticMethod {
    public static void main(String[] args) {
        Student1.change(); //calling change method
        Student1 s1 = new Student1(111,"Tu");
        Student1 s2 = new Student1(222,"Huan");
        //display method;
        s1.display();
        s2.display();
    }
}
