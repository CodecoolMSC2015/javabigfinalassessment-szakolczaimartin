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
		List<String> personList = new ArrayList<>();

		if (type.MANDATORY == type)
		{
			int result = 0;
			String bestPerson = "";

			for (String string : search.CSVDataReader(criterium))
			{

				String[] dataLine = string.split(",");

				if (result <= Integer.parseInt(dataLine[4]))
				{
					result = Integer.parseInt(dataLine[4]);
					bestPerson = string;

				}

			}
			personList.add(bestPerson);

		}
		if (type.OPTIONAL == type)
		{
			for (String string : search.CSVDataReader(criterium))
			{

				personList.add(string);

			}

		}
		return personList;

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
