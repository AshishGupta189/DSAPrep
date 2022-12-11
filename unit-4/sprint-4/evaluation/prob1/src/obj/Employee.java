package obj;

public class Employee {

	private int id;
	private String name;
	private String address;
	private String email;
	private String password;
	private int salary;
	private int did;
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", email=" + email + ", password="
				+ password + ", salary=" + salary + ", did=" + did + "]";
	}
	public Employee(int id, String name, String address, String email, String password, int salary, int did) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.email = email;
		this.password = password;
		this.salary = salary;
		this.did = did;
	}
	

}
