package Builder;

/**
 * Student Title Enumeration
 *
 * @author Andy Chen
 */
public enum Title
{
    CLASS_MONITOR("Class Monitor"),

    ASSISTANT_CLASS_MONITOR("Assistant Class Monitor"),

    CLASS_COMMISSARY("Class Commissary"),

    NORMAL_STUDENT("Normal Student");

    private final String m_title;

    Title(String sTitle)
    {
        this.m_title = sTitle;
    }

    @Override
    public String toString()
    {
        return this.m_title;
    }
}
