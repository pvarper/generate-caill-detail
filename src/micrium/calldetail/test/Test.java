package micrium.calldetail.test;

import java.io.File;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import micrium.calldetail.Generate;

import org.apache.log4j.xml.DOMConfigurator;

public class Test {

	//private static final Logger log = Logger.getLogger(Generate.class);
	public static int ses=0;
	public static void main(String[] args) throws ParseException {
	//	DOMConfigurator.configure("etc" + File.separator + "log4j.xml");
		
		//Generate.generateTBol();
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = dateFormat.parse("10/03/2015");		
		long time = date.getTime();
		Timestamp fechaResolucion=new Timestamp(time);
		
		
		Date hoy2=dateFormat.parse(dateFormat.format(new Date()));
		if(hoy2.getTime()>fechaResolucion.getTime()){
			System.out.println("si");
		}else{
			System.out.println("no");
		}

		
	}
	
	
}
