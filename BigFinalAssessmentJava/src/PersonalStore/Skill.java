package PersonalStore;

public class Skill
{
	String name;
	String description;
	double rate;

	public Skill(String name, String description)
	{
		super();
		this.name = name;
		this.description = description;
	}

	public String getName()
	{
		return name;
	}

	public String getDescription()
	{
		return description;
	}

	public double getRate()
	{
		return rate;
	}

}
