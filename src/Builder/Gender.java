package Builder;

/**
 * Student Gender Enumeration
 *
 * @author Andy Chen
 */
public enum Gender
{
    FEMALE, MALE;

    @Override
    public String toString()
    {
        return name().toLowerCase();
    }
}
