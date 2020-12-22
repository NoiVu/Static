
public class TestStaticClass {
    private String student;

    public TestStaticClass(String student) {
        this.student = student;
    }
    // static class
    static class YourName{
        public static String YOUR_NAME="LamVM";
    }
    // the class print data in static class
    public void printData(){
        System.out.println("Your name is: "+ YourName.YOUR_NAME);
    }
    public static void main(String[] args) {
        TestStaticClass testStaticClass = new TestStaticClass("TuDepZai");
        testStaticClass.printData();
    }
}
