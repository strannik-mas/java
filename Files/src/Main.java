import java.io.*;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.out;
public class Main {
	public static final String fName1 = ".."+File.separator+"test1.txt";
	
	public static final String fName2 = "..\\test2.txt";
	
	public static final String dirName1 = "..\\";

	public static void main(String[] args) throws IOException {
		File f1 = new File(fName1);
		if (!f1.exists()) {
			f1.createNewFile();
		}
		Date d = new Date(f1.lastModified());
		out.println(d.toLocaleString());
		out.println(f1.getCanonicalPath());

		File d1 = new File(dirName1);
		
		File[] files = d1.listFiles(
				new FilenameFilter() {
					
					@Override
					public boolean accept(File dir, String name) {
						// TODO Auto-generated method stub
						return name.startsWith("A") || name.startsWith("B") || name.startsWith("t");
					}
				}
			);
		
		File[] files2 = d1.listFiles(
				new FileFilter() {
					
					@Override
					public boolean accept(File f) {
						Date d = new Date(f.lastModified());
						Date n = new Date();
						return d.getYear() == n.getYear() &&
								d.getMonth() == n.getMonth() &&
								d.getDate() == n.getDate();
					}
				}
			);
		
		for(File f :files2) {
			if (f.isDirectory())
				out.println(f.getName().toUpperCase());
			if(f.isFile())
				out.println(f.getName().toLowerCase());
		}
		
		BufferedReader reader = new BufferedReader(new FileReader(fName1));
		String s;
		
		 while((s = reader.readLine()) != null) out.println(s);
		
		reader.close();
	/*	 
		Scanner reader2 = new Scanner(new FileInputStream(fName1));
		reader2.useLocale(new Locale("ru"));
		
		try {
			while(reader2.hasNext()) {
				int a = reader2.nextInt();
				double b = reader2.nextDouble();
				String c = reader2.nextLine();
				out.printf("%s %g, %d\n", c, b, a);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			reader2.close();
		}
	*/	
		FileWriter fw = new FileWriter(fName2);
		fw.write("New line");
		fw.close();
	}

}
