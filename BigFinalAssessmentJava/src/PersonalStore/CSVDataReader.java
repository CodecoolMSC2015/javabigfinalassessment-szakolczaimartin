package PersonalStore;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CSVDataReader
{
	String csvFilePath = "C:\\Users\\Szakolczai Martin\\Desktop\\persons.csv";

	public void CSVDataReader(String criterium) throws IOException
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
			br.close();

		}
	}

}