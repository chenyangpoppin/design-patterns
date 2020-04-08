package Builder;

public class Student {

    private final int m_studentNo;
    private final int m_age;
    private final String m_name;
    private final String m_gender;

    private Student(final Builder builder)
    {
        this.m_studentNo = builder.m_studentNo;
        this.m_age = builder.m_age;
        this.m_name = builder.m_name;
        this.m_gender = builder.m_gender;
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

    public String getGender()
    {
        return this.m_gender;
    }

    public static class Builder
    {
        private int m_age;
        private int m_studentNo;
        private String m_name;
        private String m_gender;

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

        public Builder withGender(String sGender)
        {
            this.m_gender = sGender;
            return this;
        }

        public Student build()
        {
            return new Student(this);
        }
    }
}
