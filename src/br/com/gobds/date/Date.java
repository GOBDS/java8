package br.com.gobds.date;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Date {

	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		
		LocalDate data = LocalDate.of(2099,01,25);
		System.out.println(data);
		
		Period periodo = Period.between(localDate, data);
		System.out.println(periodo.getYears());
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String dataFormatada = formatter.format(localDate);
		
		System.out.println(dataFormatada);

	}

}
