import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Utils{
	private void readFile(String file){
		
		  InputStream input = new FileInputStream(new File(file));
		
		  String delimiter = ";" ;
		  String line = "";
		  try{
			  
			  BufferedReader reader = new BufferedReader(new InputStreamReader(input, "UTF-8"));
					  
			  while((line = reader.readLine()) != null){
				  String[] pars = line.split(delimiter);
				  
				  //Here I can check and use my Strings
				  
			  }
		  }catch(Exception e){
			  //log my error
		  }
	}
}
