public class Main {
    public static void main(String[] args) {

        //System.out.println("Hello world!");
        Student teacher = new Student();
        teacher.name = "Bhavik";
        teacher.age = 30;
        teacher.psp = 100;

        Student student = new Student();
        student.name = "Devesh";
        student.age = 25;
        student.psp = 88.00f;

        teacher.printStudent();
        student.printStudent();
        student.pauseCourse();

    }
}