package usjt.init.classesUltilitárias.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class FusoHorário {

	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		TimeZone tz = calendar.getTimeZone();
		
		System.out.println(tz);
		
//		String[] fusos = TimeZone.getAvailableIDs();
//		for (String fuso : fusos) {
//			System.out.print(fuso + "  ");
			
//		}
		
		TimeZone tzSP = TimeZone.getTimeZone("America/Sao_Paulo");
		
		System.out.println(tzSP.getDisplayName());
		System.out.println(tzSP.getID());
		
		Calendar agora = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss a z");
		System.out.println(sdf.format(agora.getTime()));
		
		
		Calendar agoraUS = Calendar.getInstance();
		agoraUS.add(Calendar.HOUR, tzSP.getOffset(System.currentTimeMillis()) / 1000 / 60/ 60 * (-1));
	}

}
