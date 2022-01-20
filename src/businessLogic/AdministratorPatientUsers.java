package businessLogic;

import java.util.ArrayList;

import data.Patient;

public class AdministratorPatientUsers {

	public AdministratorPatientUsers() {}
	
	public void showUsers(ArrayList<Patient> list) {
		for(Patient object: list) {
			System.out.println(object.toString());
		}
	}
	
	public int numberOfElements(ArrayList<Patient> list) {
		return list.size();
	}
	
	public ArrayList<Patient> setById(String searchId, ArrayList<Patient> list){
		ArrayList<Patient> sortedList = new ArrayList<Patient>();
		for(Patient object: list) {
			if(object.getId().getNumber().equals(searchId))
				sortedList.add(object);
		}
		
		return sortedList;
	}
	
	public ArrayList<Patient> setByVaccinationDate(int year, int month, ArrayList<Patient> list){
		ArrayList<Patient> sortedList = new ArrayList<Patient>();
		for(Patient object: list) {
			if(object.getVaccineAplicated().getVaccinationDate().getMonthValue() == month && object.getVaccineAplicated().getVaccinationDate().getYear() == year)
				sortedList.add(object);
		}
		return sortedList;
	}
	
	public ArrayList<Patient> setByNumberOfDosis(String searchIndex, ArrayList<Patient> list){
		ArrayList<Patient> sortedList = new ArrayList<Patient>();
		for(Patient object: list) {
			if(object.getVaccineAplicated().getNumberOfDosis().equals(searchIndex))
				sortedList.add(object);
		}
		return sortedList;
	}
	
	public ArrayList<Patient> setByAge(int a, int b, ArrayList<Patient> list){
		ArrayList<Patient> sortedList = new ArrayList<Patient>();
		
		for(Patient object: list) {
			int valueOfAge =Integer.parseInt(object.getAge()); 
			if(valueOfAge >= a && valueOfAge <= b)
				sortedList.add(object);
		}
		return sortedList;
	}
	
	
}
