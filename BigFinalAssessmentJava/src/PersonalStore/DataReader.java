package PersonalStore;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataReader extends CSVDataReader
{
	String searchCritiria;
	SearchType searchType;

	public List<String> getPersons(String criterium, SearchType type) throws IOException
	{
		CSVDataReader search = new CSVDataReader();

		if (type.MANDATORY == type)
		{
			List<String> mandList = new ArrayList<>();

			for (String string : search.CSVDataReader(criterium))
			{
				int result = 0;

				String[] dataLine = string.split(",");

				if (result <= Integer.parseInt(dataLine[4]))
				{
					mandList.add(string);

				}
				return mandList;
			}

		}
		if (type.OPTIONAL == type)
		{

		}

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
