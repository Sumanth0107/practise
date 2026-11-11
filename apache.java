package lab1293;
import java.io.File;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;


public class ReadJson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
        	ObjectMapper objectMapper=new ObjectMapper();
        	File jsonFile=new File("student.json/student.json");
        	JsonNode studentData=objectMapper.readTree(jsonFile);
        	System.out.println("Student Details:");
        	System.out.println("-------");
        	System.out.println("Name : "+studentData.get("name").asText());
        	System.out.println("Age : "+ studentData.get("age").asInt());
        	System.out.println("Department : "+ studentData.get("department").asText());
        	System.out.println("college :"+ studentData.get("college").asText());
        }
        catch(Exception e) {
        	e.printStackTrace();
        }
	}

}
