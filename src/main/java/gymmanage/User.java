package gymmanage;

public class User {
	private int id;  
	private String fullname,username,age,country,password;
	public User(int id, String fullname, String username, String age, String country,String password) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.username = username;
		this.age = age;
		this.country = country;
		this.password = password;
	}
	public User(String fullname, String username, String age, String country,String password) {
		super();
		this.fullname = fullname;
		this.username = username;
		this.password = password;
		this.age= age;
		this.country = country;
	}	public User() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}