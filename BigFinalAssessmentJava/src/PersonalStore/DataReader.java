package PersonalStore;

import java.util.Set;

public class DataReader extends CSVDataReader
{
	String searchCritiria;
	SearchType searchType;

	public Set<Person> getPersons(String name, SearchType type)
	{
		return null;
	}

	public void setSearchCritiria(String searchCritiria)
	{
		this.searchCritiria = searchCritiria;
	}

	public void setSearchType(SearchType searchType)
	{
		this.searchType = searchType;
	}

}
