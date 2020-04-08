package Builder;

/**
 * A Student Builder Class
 *
 * @Usage
 * Student jackson = new Student.Builder()
 *                              .withStudentNo(1)
 *                              .withAge(24)
 *                              .withName("Jackson")
 *                              .withGender(Gender.MALE)
 *                              .withTitle(Title.ASSISTANT_CLASS_MONITOR)
 *                              .build();
 * @author Andy Chen
 */
public class Student
{
    private final String m_name;
    private final int    m_studentNo;
    private final int    m_age;
    private final Gender m_gender;
    private final Title  m_title;

    private Student(final Builder builder)
    {
        this.m_name      = builder.m_name;
        this.m_studentNo = builder.m_studentNo;
        this.m_age       = builder.m_age;
        this.m_gender    = builder.m_gender;
        this.m_title     = builder.m_title;
    }

    public int getStudentNo()
    {
        return this.m_studentNo;
    }

    public int getAge()
    {
        return this.m_age;
    }

    public String getName()
    {
        return this.m_name;
    }

    public Gender getGender()
    {
        return this.m_gender;
    }

    public Title getTitle()
    {
        return this.m_title;
    }

    @Override
    public int hashCode()
    {
        return m_studentNo;
    }

    @Override
    public String toString()
    {
        return "{ name: "+ m_name +", studentNo: "+ m_studentNo +", age: "+ m_age +", gender: "+ m_gender.toString() +", title: "+ m_title.toString() +" }";
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;

        if (null == o || getClass() != o.getClass())
        {
            return false;
        }

        Student that = (Student) o;
        return that.getStudentNo() == this.getStudentNo();
    }

    public static class Builder
    {
        private String m_name;
        private int    m_age;
        private int    m_studentNo;
        private Gender m_gender;
        private Title  m_title;

        public Builder withStudentNo(int nStudentNo)
        {
            this.m_studentNo = nStudentNo;
            return this;
        }

        public Builder withAge(int nAge)
        {
            this.m_age = nAge;
            return this;
        }

        public Builder withName(String sName)
        {
            this.m_name = sName;
            return this;
        }

        public Builder withGender(Gender gender)
        {
            this.m_gender = gender;
            return this;
        }

        public Builder withTitle(Title title)
        {
            this.m_title = title;
            return this;
        }

        public Student build()
        {
            return new Student(this);
        }
    }
}
