package Admin;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Lista_carti_citire_fisier 
{

	@SuppressWarnings("unchecked")
	public static void main(String[] args)
	{
		JSONParser parser = new JSONParser();
		try (Reader reader = new FileReader("Books.json")) 
		{
			JSONArray jsonArray = (JSONArray) parser.parse(reader);
			Iterator<JSONObject> it = jsonArray.iterator();
			while (it.hasNext()) 
			{
				JSONObject obj = it.next();
				System.out.println(obj.get("Descriere") + " - " + obj.get("Autor")+ " - " + obj.get("Titlu carte")+ " - " + obj.get("An aparitie")+ " - " + obj.get("Genul"));
			}
			} catch (IOException e) 
			{
				e.printStackTrace();
			} catch (ParseException e) 
			{
				e.printStackTrace();
			}
	}
}