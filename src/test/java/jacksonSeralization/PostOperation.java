package jacksonSeralization;

public class PostOperation {
	
	String name;
	String description;
	
	public PostOperation(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}
	
	public PostOperation() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}



}
