package PersonalStore;

import java.io.IOException;
import java.util.List;

public abstract class DataReader
{
	String searchCritiria;
	SearchType searchType;

	public abstract List<String> getPersons(String criterium, SearchType type)
			throws NumberFormatException, IOException;

	public void setSearchCritiria(String searchCritiria)
	{
		this.searchCritiria = searchCritiria;
	}

	public void setSearchType(SearchType searchType)
	{
		this.searchType = searchType;
	}

}
