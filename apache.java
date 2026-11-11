package lab1293;
import java.io.File;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;


public class ReadJson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
        	ObjectMapper objectMapper=new ObjectMapper();
        	File jsonFile=new File(".\\JSON\\Student.json");
        	JsonNode studentData=objectMapper.readTree(jsonFile);
        	System.out.println("Student Details:");
        	System.out.println("-------");
        	System.out.println("firstName : "+studentData.get("firstname").asText());
        	System.out.println("lastName : "+ studentData.get("lastname").asInt());
        }
        catch(Exception e) {
        	e.printStackTrace();
        }
	}

}
