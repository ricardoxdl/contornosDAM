package json;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

public class PruebaJSON {

	public static void main(String[] args) throws IOException{

		JSONObject js = new JSONObject();
		
		
		js.put("Personas", new JSONArray()
				.put(new JSONObject()
						.put("Persona", new JSONArray()
								.put(new JSONObject()
										.put("Nombre", "Samuel")
										.put("Edad", 20))))
						.put(new JSONObject()
								.put("Persona", new JSONArray()
										.put(new JSONObject()
												.put("Nombre", "Ricardo")
												.put("Edad", 25)))));

		PrintStream ps = null;
		
			
				ps= new PrintStream("pruebaJSON.json");
				ps.print(js);
				ps.close();
	
				JSONTokener jt = new JSONTokener(new FileInputStream("pruebaJSON.json"));
				JSONObject js2= new JSONObject(jt);
				jt.close();
		
		
				ps= new PrintStream("pruebaLecturaJSON.json");
				ps.print(js2);
				ps.close();
				System.out.println(js2.toString(5));
		
		
	}

}
