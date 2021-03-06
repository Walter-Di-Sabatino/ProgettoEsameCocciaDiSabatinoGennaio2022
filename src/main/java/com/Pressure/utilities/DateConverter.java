package com.Pressure.utilities;

import java.sql.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.Pressure.exceptions.DateFormatException;


/**
 * Classe utilizzata per effettuare le conversione da Date in secondi e viceversa
 * @author Giansimone&Walter
 *
 */
public class DateConverter{
	
	/**
	 * Default constructor
	 */
	public DateConverter() {
		super();
	}
	
	/**
	 * 
	 * @param date The string date passed
	 * @return The seconds converted
	 * @throws DateFormatException for format date error
	 */
	public Long dateToSeconds(String date) throws DateFormatException{
		
		SimpleDateFormat sdf;
		
		Boolean bool1;

		if(date.length()==("dd/MM/yyyy HH:mm:ss").length())
		{
			bool1= date.charAt(2)=='/' && date.charAt(5)=='/' && date.charAt(10)==' '&& date.charAt(13)==':' && date.charAt(16)==':';
			if(bool1)
				sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			else 
				throw new DateFormatException("Formato data errato,le date possono essere solo nel formato dd/MM/yyyy HH:mm:ss o dd/MM/yyyy");
		}
		else if(date.length()==("dd/MM/yyyy").length())
		{
			bool1= date.charAt(2)=='/' && date.charAt(5)=='/';
			if(bool1)
				sdf = new SimpleDateFormat("dd/MM/yyyy");
			else 
				throw new DateFormatException("Formato data errato,le date possono essere solo nel formato dd/MM/yyyy HH:mm:ss o dd/MM/yyyy");
		}
		else 
			throw new DateFormatException("Formato data errato,le date possono essere solo nel formato dd/MM/yyyy HH:mm:ss o dd/MM/yyyy");

		try {
			java.util.Date dateObj = sdf.parse(date);
			long seconds = dateObj.getTime()/1000;

			return seconds;
		} catch (ParseException ParseE) {
			System.out.println("Errore di Parsing");
			System.out.println(ParseE);
		} catch (Exception e) {
			System.out.println("Errore generale");
			System.out.println(e);
		}
		return null;	
	}
	
	public String secondsToDate(long seconds){
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date dateObj=new Date((long)seconds*1000);
			String dateString =(String) sdf.format(dateObj);
			return dateString;
	}
}
