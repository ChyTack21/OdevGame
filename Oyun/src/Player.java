
public class Player {
	
	private String id;
	private String firstName;
	private String lastName;
	private String yearofBirth;
	private String identityNumber;
	
	public Player () {
		
		
		
	}
	
	
	
	
	
	
	public Player(String id, String firstName, String lastName, String yearofBirth,String identityNumber) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.yearofBirth = yearofBirth;
		this.identityNumber=identityNumber;
	}






	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getYearofBirth() {
		
		yearofBirth=yearofBirth.substring(0,2)+"/"+yearofBirth.substring(2,4)+"/"+yearofBirth.substring(4,8);
		
		return yearofBirth;
	}
	public void setYearofBirth(String yearofBirth) {
		this.yearofBirth = yearofBirth;
	}

    public String getIdentityNumber() {
		return identityNumber;
	}

    public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}
	
	
	
	
	

}
