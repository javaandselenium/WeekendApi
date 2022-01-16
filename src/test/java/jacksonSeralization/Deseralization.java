package jacksonSeralization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

public class Deseralization {
	@Test
	public void demo() throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper =new ObjectMapper();
		Project pobj = mapper.readValue(new File("./project.json"),Project.class);
	System.out.println(pobj.employeeage);
		System.out.println(pobj.employeeName);
		System.out.println(pobj.empSalary);
		System.out.println(pobj.teamSize);
	}

}
