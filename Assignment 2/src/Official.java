public class Official implements Participants {

	private String ID;
	private String Type;
	private String Name;
	private String Age;
	private String State;

	public Official(String ID, String Type, String Name, String Age, String State) {
		// TODO Auto-generated constructor stub

		this.ID = ID;
		this.Type = Type;
		this.Name = Name;
		this.Age = Age;
		this.State = State;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAge() {
		return Age;
	}

	public void setAge(String age) {
		Age = age;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}
}
