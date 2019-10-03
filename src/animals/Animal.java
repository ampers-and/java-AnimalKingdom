package animals;

public abstract class Animal
{
    static int maxId = 0;
    int id;
    String name;
    Integer yearDiscovered;

    public Animal()
    {   
        maxId++;
        id = maxId;
    }

    public Animal(String name, Integer yearDiscovered)
    {
        maxId++;
        id = maxId;
        this.name = name;
        this.yearDiscovered = yearDiscovered;
    }

    //Setters and getters
    public int getId()
    {
        return id;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setYearDiscovered(Integer yearDiscovered)
    {
        this.yearDiscovered = yearDiscovered;
    }

    public Integer getYearDiscovered()
    {
        return yearDiscovered;
    }

    public abstract String move();
    public abstract String breathe();
    public abstract String reproduce();

    @Override
    public String toString()
    {
        return "\n Id: " + id +
                "\n Name: " + name +
                "\n Year Discovered: " + yearDiscovered + 
                "\n Moves: " + move() + 
                "\n Breathes: " + breathe() +
                "\n Reproduces: " + reproduce();
    }

}