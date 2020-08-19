import Builder.Gender;
import Builder.Student;
import Builder.Title;

/**
 * Entry point class for the whole application
 *
 * @author Andy Chen
 */
public class Main
{
    public static void main(String[] args) {
        // Eg 1: Builder design pattern usage
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
