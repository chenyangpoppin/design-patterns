import Builder.Student;

public class Main {

    // Entry point file for whole application
    public static void main(String[] args)
    {
        Student stu = new Student.Builder()
                                 .withStudentNo(1)
                                 .withAge(24)
                                 .withName("Jackson")
                                 .withGender("Female")
                                 .build();

        System.out.println(stu.getName());
    }

}
