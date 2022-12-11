package obj;

public class department {

	private int id;
	private String name;
	private String location;
	public department(int id, String name, String location) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
	}
	@Override
	public String toString() {
		return "department [id=" + id + ", name=" + name + ", location=" + location + "]";
	}
	
}
