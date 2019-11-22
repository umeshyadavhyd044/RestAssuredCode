package restassured;

public class Posts {
	
	private String name;
	private String location;
	private String salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Posts [name=" + name + ", location=" + location + ", salary=" + salary + "]";
	}

}
