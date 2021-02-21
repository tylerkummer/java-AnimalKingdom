package animalKingdom;

public abstract class Animals
{
    private static int maxId = 0;
	
    private int id;
    private String name;
    private int yearNamed;

    public Animals(String name, int yearNamed)
    {
        this.id = maxId++;
        this.name = name;
        this.yearNamed = yearNamed;
    }

    public String consume()
    {
        return "Food";
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public int getyearNamed()
    {
        return yearNamed;
    }

    public abstract String move();
    public abstract String breath();
    public abstract String reproduce();

    @Override
    public String toString()
    {
        return "Animals{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", yearNamed=" + yearNamed +
            '}' + '\n';
    }
}
