package PersonalStore;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CSVDataReader extends DataReader
{
	String csvFilePath = "C:\\Users\\Szakolczai Martin\\Desktop\\persons.csv";

	public Set<Person> CSVDataReader()
	{
		return null;
	}

	public List<String> search(String criterium) throws IOException
	{
		FileInputStream fstream = new FileInputStream(csvFilePath);
		BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
		List<String> person = new ArrayList<>();

		String line;

		while ((line = br.readLine()) != null)
		{
			String[] criteriumArray = criterium.split(",");
			String[] dataLine = line.split(",");
			for (int i = 0; i < criteriumArray.length; i++)
			{
				if (dataLine[2].toLowerCase().equals(criteriumArray[i].toLowerCase()))
				{
					person.add(line);

				}
			}

		}
		br.close();
		return person;

	}

	@Override
	public List<String> getPersons(String criterium, SearchType type) throws NumberFormatException, IOException
	{

		List<String> personList = new ArrayList<>();

		if (type.MANDATORY == type)
		{
			int result = 0;
			String bestPerson = "";

			for (String string : search(criterium))
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
			for (String string : search(criterium))
			{

				personList.add(string);

			}

		}
		return personList;
	}

}