package PersonalStore;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CSVDataReader
{
	String csvFilePath;
	List<Person> person;

	public void CSVDataReader(String filePath) throws IOException
	{
		FileInputStream fstream = new FileInputStream(filePath);
		BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
		List<String> person = new ArrayList<>();

		String line;

		while ((line = br.readLine()) != null)
		{
			person.add(line);
		}
		br.close();

	}

}
