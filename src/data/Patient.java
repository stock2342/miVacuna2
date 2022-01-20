package data;

import java.time.LocalDate;

public class Patient {
	private String name;
	private String surname;
	private LocalDate dateOfBirth;
	private PersonalId id;
	private Vaccine vaccineAplicated;
	private String age;
	
	public Patient(String name, String surname, LocalDate dateOfBirth, PersonalId id, Vaccine vaccineAplicated) {
		this.name = name;
		this.surname = surname;
		this.dateOfBirth = dateOfBirth;
		this.id = id;
		this.vaccineAplicated = vaccineAplicated;
		int yearOfBirth = this.dateOfBirth.getYear();
		int actualYear = LocalDate.now().getYear();
		String age = String.valueOf(actualYear - yearOfBirth);
		this.age = age;
	}
	
	

	@Override
	public String toString() {
		return "name=" + name + ", surname=" + surname + ", dateOfBirth=" + dateOfBirth+ ", id number = "+ id.getNumber() + ", vaccine Maker(Vaccine name) =" + vaccineAplicated.getVaccineMaker() + ", vaccination date = " +vaccineAplicated.getVaccinationDate() + ", Number of the dosis = " + vaccineAplicated.getNumberOfDosis() + ", age=" + age + ". ";
	}



	public String getAge() {
		return age;
	}



	public void setAge(String age) {
		this.age = age;
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

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public PersonalId getId() {
		return id;
	}

	public void setId(PersonalId id) {
		this.id = id;
	}

	public Vaccine getVaccineAplicated() {
		return vaccineAplicated;
	}

	public void setVaccineAplicated(Vaccine vaccineAplicated) {
		this.vaccineAplicated = vaccineAplicated;
	}
	
	
	
	
	
	
}
