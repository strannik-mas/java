import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.out;

import java.text.DateFormat;
import java.text.ParseException;

public class Main {

	public static void main(String[] args) {
		long r1 = System.currentTimeMillis();
		Date now = new Date();
		
		//out.println(r1);
		out.println(now); out.println(now.toLocaleString());
		out.println(now.getYear()+1900); out.println(now.getTimezoneOffset());
		
		Calendar sys = Calendar.getInstance();
		
		Calendar rus = Calendar.getInstance(new Locale("ru"));
		out.println(rus.get(Calendar.YEAR));
		out.println(rus.get(Calendar.MONTH));
		out.println(rus);
		long r2 = System.currentTimeMillis();
		out.println(r2-r1);
		out.printf("%1$tY %1$tB %1$td\n", rus);
		
		DateFormat f = DateFormat.getDateInstance(DateFormat.LONG);
		String result = f.format(rus.getTime());
		out.println(result);
		
		DateFormat fInput = DateFormat.getDateInstance(DateFormat.SHORT, new Locale("ru"));
		Scanner sc = new Scanner(System.in);
		out.print("¬ведите дату: ");
		
		try {
			Date d = fInput.parse(sc.nextLine());
			out.println(d.toLocaleString());
		} catch (ParseException e) {
			out.println(e.getMessage());
		}
	}

}
