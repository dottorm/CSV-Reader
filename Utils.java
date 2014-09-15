import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Utils{
	private void readFile(InputStream file){
		  String delimiter = ";" ;
		  String line = "";
		  try{
			  
			  BufferedReader reader = new BufferedReader(new InputStreamReader(file, "UTF-8"));
					  
			  while((line = reader.readLine()) != null){
				  String[] pars = line.split(delimiter);
				  
				  //Here I can check and use my Strings
				  
			  }
		  }catch(Exception e){
			  //log my error
		  }
	}
}
