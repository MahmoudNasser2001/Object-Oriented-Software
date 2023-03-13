package c322.Homeworks.Homework6.PartA;

public class Profile {
    private String name;
    private String ID;

    public Profile(String name, String ID)
    {
        this.name = name;
        this.ID =ID;
    }
    String getId()
    {
        return this.ID;
    };
    String getName()
    {
        return this.name;
    };
}