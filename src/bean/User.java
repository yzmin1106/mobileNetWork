package bean;

public class User {

	public String name;
	public String weight;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		
		return "-------------------->{“name”:“"+this.name+"”,“weight“:”"+this.weight+"”}";
	}
	
	
	
	
	
}
