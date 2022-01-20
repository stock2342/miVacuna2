package data;

import java.time.LocalDate;

public class Vaccine {
	private String vaccineMaker;
	private LocalDate vaccinationDate;
	private String numberOfDosis;
	
	public Vaccine(String vaccineMaker, LocalDate vaccinationDate, String numberOfDosis) {
		this.vaccineMaker = vaccineMaker;
		this.vaccinationDate = vaccinationDate;
		this.numberOfDosis = numberOfDosis;
	}

	public String getVaccineMaker() {
		return vaccineMaker;
	}

	public void setVaccineMaker(String vaccineMaker) {
		this.vaccineMaker = vaccineMaker;
	}

	public LocalDate getVaccinationDate() {
		return vaccinationDate;
	}

	public void setVaccinationDate(LocalDate vaccinationDate) {
		this.vaccinationDate = vaccinationDate;
	}

	public String getNumberOfDosis() {
		return numberOfDosis;
	}

	public void setNumberOfDosis(String numberOfDosis) {
		this.numberOfDosis = numberOfDosis;
	}
	
	
}
