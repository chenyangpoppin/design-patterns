import Builder.Gender;
import Builder.Student;
import Builder.Title;

public class Main
{
    // Entry point file for the whole application
    public static void main(String[] args) {
        Student jackson = new Student.Builder()
                                     .withStudentNo(1)
                                     .withAge(24)
                                     .withName("Jackson")
                                     .withGender(Gender.MALE)
                                     .withTitle(Title.ASSISTANT_CLASS_MONITOR)
                                     .build();

        System.out.println(jackson.toString());
    }
}
