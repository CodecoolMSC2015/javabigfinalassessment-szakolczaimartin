package PersonalStore;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class PersonStoreServerSocket
{
	DataReader store;

	public void runServer()
	{

		try
		{
			ServerSocket serverSocket = new ServerSocket(6666);
			System.out.println("Server created.\n");
			Socket socket = serverSocket.accept();

			System.out.println("Connected to Server\n");

			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			String firstString;
			String secondString;
			while (true)
			{
				firstString = reader.readLine();
				secondString = reader.readLine();

				if (firstString.equals("MANDATORY"))
				{
					reader.readLine();
					CSVDataReader searching = new CSVDataReader();
					System.out.println("The best person for us: ");
					System.out.println(searching.getPersons(secondString, SearchType.MANDATORY));

				}

				if (firstString.equals("OPTIONAL"))
				{
					reader.readLine();
					CSVDataReader searching = new CSVDataReader();
					System.out.println("Good persons for us: \n");

					for (String persons : searching.getPersons(secondString, SearchType.OPTIONAL))
					{
						System.out.println(persons);

					}
					// System.out.println(searching.getPersons(secondString,
					// SearchType.OPTIONAL));

				}

				serverSocket.close();
				break;
			}

		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void start()
	{

	}

	public static void main(String[] args)
	{
		PersonStoreServerSocket run = new PersonStoreServerSocket();
		run.runServer();
	}

}
