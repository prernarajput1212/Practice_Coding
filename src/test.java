import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.swing.text.DateFormatter;
import javax.xml.bind.ParseConversionEvent;

public class test {

	public static void main(String[] args) throws ParseException {
	/*	 String s1="NOTCLEARED";
		 String s2= s1.substring(0, 3)+" "+s1.substring(3);
		System.out.print("string"+s2); */
		/*LocalDateTime date =LocalDateTime.now();
		String date1=date.format(DateTimeFormatter.ofPattern("M/dd/yyyy"));
		System.out.println("Date for Haj operation "+date1);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/dd/yyyy");
		LocalDateTime ldt=LocalDateTime.parse(date1, formatter);
		//LocalDateTime ldt = LocalDateTime.parse(date1,formatter);
		System.out.println("Date for Haj operation "+ldt);
		*/
//		LocalDateTime dt = LocalDateTime.parse("date",
//				DateTimeFormatter.ofPattern("M/dd/yyyy"));
//		//DateTimeFormatter formatter=DateTimeFormatter.ofPattern("M/dd/yyyy");
//		System.out.println("Date for Haj operation "+dt);
//	
	//	String date1=formatter.format(date);
	//	System.out.println("Date for Haj operation "+date1);
	//	LocalDateTime nn= LocalDateTime.parse("date1", formatter);
		//LocalDateTime now=LocalDateTime.parse(date1);
	//	System.out.println("nowDate for Haj operation "+now);
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//        LocalDate date =(LocalDate.now().plusDays(1));
//        LocalDate localDate = formatter.format(date);
//        System.out.println("date: "+localDate);
		
	//	LocalDate date=LocalDate.now();
	//	LocalDate start= date.minusMonths(3).withDayOfMonth(1);
	//	int length=start.lengthOfMonth();
	//	LocalDate enDate=date.minusMonths(3).withDayOfMonth(length);
		//DateTime previousMonthStartDate = DateTime.now().minusMonths(1).withDayOfMonth(1).toDateTime(DateTimeZone.forID("Asia/Calcutta"));
//		String rejDate="2023-11-23";
//	//	DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd-MM-yyyy");
//		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
//		try {
//		Date newStartdate = formatter.parse(rejDate);
//		String startDate=newStartdate.toString();
//		//LocalDateTime startDate=LocalDateTime.parse(rejDate, formatter);
//		System.out.println(newStartdate);
//		//System.out.println(startDate);
//		}catch (Exception e) {
//			e.printStackTrace();
//		}
//		LocalDate localDate = LocalDate.now();
//		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy"); 
//		 String str = localDate.format(dateTimeFormatter);
//		System.out.println(str);
//		LocalDate date=LocalDate.parse(str,dateTimeFormatter);
//		System.out.println(date);
//		LocalDate localDate=LocalDate.now();
//		SimpleDateFormat formatter =  new SimpleDateFormat("MMM ''yyyy");06-03-2023
//        String date=formatter.format(localDate);
//        System.out.println(date);
//		SimpleDateFormat month_date = new SimpleDateFormat("MMM ''yyyy");
//		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
//
//		LocalDate actualDate = LocalDate.now();
//
//		Date date = sdf.parse(actualDate);
//
//		String month_name = month_date.format(date);
//		System.out.println("Month :" + month_name);
      //  LocalDate cal=LocalDate.parse(date);
		        //	LocalDateTime newRejDate=startDate.plusMonths(6);
		
	//	System.out.println(newRejDate);
//		LocalDateTime no=LocalDateTime.now().plusDays(1);
//		String nowTime = no.format(formatter);  
//		 LocalDateTime newNow=LocalDateTime.parse(nowTime, formatter);
//		 System.out.println(newNow);
//	//	 if(!newNow.isAfter(newRejDate)) {
//			 System.out.println("false");
//		 }
//		 else
//			 System.out.println("true");
//		
		
		/*String date="2023-11-01";
//		//String date="2022-10-10 17:26";
	 DateTimeFormatter formatter =
	               DateTimeFormatter.ofPattern("yyyy-MM-dd");
	 LocalDateTime date2=LocalDateTime.parse(date, formatter);
          String date1=date.format(date, formatter);
		*/
	String dateString = "4/3/2023";

        // Define the date format of the input string
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy");

        try {
            // Parse the string to a LocalDateTime object
            LocalDateTime localDateTime = LocalDateTime.parse(dateString, formatter);

            // Print the result
            System.out.println("Original String: " + dateString);
            System.out.println("Converted LocalDateTime: " + localDateTime);
        } catch (DateTimeParseException e) {
            // Handle the exception if the parsing fails
            System.out.println("Error parsing the date: " + e.getMessage());
        }
        // Print the result
        System.out.println("Original String: " + dateString);
     //   System.out.println("Converted LocalDateTime: " + localDateTime);
	//	 System.out.println("String date  ...." +time);
//       System.out.println("selectedTime in string  ...." +selectedTime)
//		LocalDateTime now = LocalDateTime.now();//16
//		 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//         String selectedTime = now.format(formatter);
//         
//         LocalDateTime dateTime = LocalDateTime.parse(selectedTime, formatter);
//        
//    
//         System.out.println("now localDateTime ...." +now);
//         System.out.println("selectedTime in string  ...." +selectedTime);
//        System.out.println("dateTime in localDateTime...." +dateTime);
//       //  System.out.println("replace in localDateTime...." +dateTime1);
		
		//DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm");
		//DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-m-dd hh:mm");
      //  String selectedTime = formatter.format(ata);
       // System.out.println("ataconverted ...." +selectedTime);
//		LocalTime atd =LocalTime.now().minusMinutes(35);
//		System.out.println("ata...." +ata);
//		System.out.println("atd---------"+atd);
//		if(atd.isBefore(ata.minusMinutes(40))) {
//			System.out.println("true"+atd.isBefore(ata.minusMinutes(40)));
//		}
//		else
//		{System.out.println("false-----"+(ata.minusMinutes(40)));
//		}
//		List<String> slRemarks=new ArrayList<>(); 
//		slRemarks.add("SL");
//		slRemarks.add("Sick");
//		if(slRemarks.contains("Sick")) {
//			System.out.println("found");
//			
//		}else {
//			System.out.println("nnnnnfound");
//			
//		}
//		String filteredBase= "GGN###AYT###";
//		List<String> base =new ArrayList<>();
//		base.add("AYT");
//		base.add("BOM");
//		base.add("BLR");
//		for (String s :base) 
//			System.out.print(!(filteredBase.indexOf(s.trim()) >-1));
//		LocalDateTime date1=LocalDateTime.now();
//		LocalDate date2= date1.toLocalDate();
//		System.out.println(date1);
//		System.out.println(date2);
//		
		
		
		//	System.out.println(filteredBase.indexOf(s.trim()));
		
			//System.out.println(s);
		
		
		// TODO Auto-generated method stub

	}
}
	
