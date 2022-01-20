package businessLogic;

import data.Patient;
import data.Vaccinator;

public class CreateVaccinationCard {
	private Patient patient;
	private Vaccinator vaccinator;
	public CreateVaccinationCard(Patient patient, Vaccinator vaccinator) {
		this.patient = patient;
		this.vaccinator = vaccinator;
	}
	
	public void printVaccinationCard() {
		System.out.println("*******VACCNIATION CARD*******");
		System.out.println("PATIENT: ");
		System.out.print("Name: " + this.patient.getName() + " " + this.patient.getSurname() + ".	");
		System.out.print("Date of birth: " + this.patient.getDateOfBirth() + ". 	");
		System.out.println("ID type: " + this.patient.getId().getType() + " Number: " + this.patient.getId().getNumber());
		System.out.println("VACCINATOR: ");
		System.out.print("Name: " + this.vaccinator.getName() + " " + this.vaccinator.getSurname() + ".	");
		System.out.print("Name of Hospital: " + this.vaccinator.getHospitalName() + ". 	");
		System.out.println("ID type: " + this.vaccinator.getId().getType() + " Number: " + this.vaccinator.getId().getNumber());
		System.out.println("NUMBER OF DOSIS: " + this.patient.getVaccineAplicated().getNumberOfDosis());
		System.out.println("VACCINATION DATE: " + this.patient.getVaccineAplicated().getVaccinationDate());
		System.out.println("VACCINE MAKER: " + this.patient.getVaccineAplicated().getVaccineMaker());
		System.out.println("*******************************");
	}
}
