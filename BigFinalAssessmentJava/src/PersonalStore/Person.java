package PersonalStore;

import java.util.List;

public class Person
{
	String name;
	String email;
	List<Skill> skillset;

	public Person(String name, String email)
	{
		super();
		this.name = name;
		this.email = email;
	}

	public Person()
	{
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public List<Skill> getSkillset()
	{
		return skillset;
	}

	public void setSkillset(List<Skill> skillset)
	{
		this.skillset = skillset;
	}

	public void addSkill(List<Skill> skill)
	{

	}

}
