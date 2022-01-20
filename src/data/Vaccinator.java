package data;

public class Vaccinator {
	private String name;
	private String surname;
	private PersonalId id;
	private String hospitalName;
	public Vaccinator(String name, String surname, PersonalId id, String hospitalName) {
		this.name = name;
		this.surname = surname;
		this.id = id;
		this.hospitalName = hospitalName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public PersonalId getId() {
		return id;
	}
	public void setId(PersonalId id) {
		this.id = id;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	
	
}
