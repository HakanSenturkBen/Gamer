import java.sql.Date;



public class Player {

	private int id;
	private String firstName;
	private String lastName;
	private int bornedYear;
	private String citizenShipIdentity;
	private Date createDate;

	public Player() {
	
	}
	
	public Player(String firstName, String lastName, int bornedYear, String citizenShipIdentity, Date createDate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.bornedYear = bornedYear;
		this.citizenShipIdentity = citizenShipIdentity;
		this.createDate=createDate;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public int getBornedYear() {
		return bornedYear;
	}
	public void setBornedYear(int bornedYear) {
		this.bornedYear = bornedYear;
	}
	public String getCitizenShipIdentity() {
		
		return citizenShipIdentity;
	}
	public void setCitizenShipIdentity(String citizenShipIdentity) {
		this.citizenShipIdentity = citizenShipIdentity;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return " " + firstName + " "+ lastName +" ";
	}
	
	
}
