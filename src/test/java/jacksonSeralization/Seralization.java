package jacksonSeralization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

public class Seralization {
	@Test
	public void demo() throws JsonGenerationException, JsonMappingException, IOException {
	Project pobj=new Project("John",20,89.00,4);
	
	ObjectMapper mapper=new ObjectMapper();
	mapper.writeValue(new File("./project.json"),pobj);
	
	}

}
