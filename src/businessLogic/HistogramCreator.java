package businessLogic;

import java.util.ArrayList;
//import creatorOfListsOfPatients.PatientsCreator;
import data.Patient;



public class HistogramCreator {
	
	public void createHistogramByMonths(ArrayList<Patient> generalList) {
		AdministratorPatientUsers admin = new AdministratorPatientUsers();
		int data2021[] = new int[12];
		for(int j = 1; j <= 12; j++) {
			int noPeople21 = admin.setByVaccinationDate(2021, j, generalList).size();	
			data2021[j-1] = noPeople21;
		}
		int total = 0;
		System.out.println("Personas vacunadas en 2021 (Histograma):");
		for(int i = 0; i < data2021.length; i++) {
			int noTotalList = generalList.size();
			int noSortedList = admin.setByVaccinationDate(2021, i + 1, generalList).size();
			int noPercentage = setNumberOfFigures(noTotalList, noSortedList);
			String month = setMonth(i);
			String figures = setFiguresHistogram(noPercentage);
			System.out.printf("%s\t|%d|\t%s", month, data2021[i], figures);
			total += data2021[i]; 
			System.out.println();
		}
		System.out.println("El total de datos representados son: " + total);		
	}
	
	public void createHistogramByAges(ArrayList<Patient> generalList) {
		AdministratorPatientUsers admin = new AdministratorPatientUsers();
		int dataByAges[] = new int[8];
		for(int i = 1; i<=8; i++) {
			int noPeople = admin.setByAge((i*10) + 1,(i*10) + 10, generalList).size();
			dataByAges[i-1] = noPeople;
		}
		int total = 0;
		System.out.println("Personas vacunadas mostradas por rangos de edad (Décadas): ");
		for(int i = 1; i <= dataByAges.length; i++) {
			int noTotalList = generalList.size();
			int noSortedList = admin.setByAge((i*10) + 1, (i*10) + 10, generalList).size();
			int noPorcentage = setNumberOfFigures(noTotalList, noSortedList);
			String figures = setFiguresHistogram(noPorcentage);
			System.out.printf("%d-%d\t|%d|\t%s", (i*10) + 1, (i*10) + 10, dataByAges[i-1], figures);
			total += dataByAges[i-1];
			System.out.println();
		}
		System.out.println("El total de datos representados son: " + total);
	}
	
	
	private String setFiguresHistogram(int j) {
		String figures = "";
		for(int i = 0; i < j; i++) {
			figures += "#";
		}
		return figures;
	}
		
	private int setNumberOfFigures(int noTotalList, int noSortedList) {
		int percentageShow = (noSortedList * 100) / noTotalList;
		return percentageShow;
	}
	
	private String setMonth(int i) {
		String mes = null;
		switch (i) {
		case 0:
			mes = "Jan";
			break;
		case 1:
			mes = "Feb";
			break;
		case 2:
			mes = "Mar";
			break;
		case 3:
			mes = "Apr";
			break;
		case 4:
			mes = "May";
			break;
		case 5:
			mes = "Jun";
			break;
		case 6:
			mes = "Jul";
			break;
		case 7:
			mes = "Aug";
			break;
		case 8:
			mes = "Sep";
			break;
		case 9:
			mes = "Oct";
			break;
		case 10:
			mes = "Nov";
			break;
		case 11:
			mes = "Dec";
			break;
		}
		return mes;
	}

//	public static void main(String[] args) {
//		ArrayList<Patient> list = new ArrayList<Patient>();
//		int numberOfElements = 1000;
//		PatientsCreator pc = new PatientsCreator(numberOfElements);
//		HistogramCreator hc = new HistogramCreator();
//		pc.generateListOfPatients(list);
//		hc.createHistogramByAges(list);
//	}
}
