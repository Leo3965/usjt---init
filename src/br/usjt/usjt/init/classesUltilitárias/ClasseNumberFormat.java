package usjt.init.classesUltilitárias;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;

public class ClasseNumberFormat {

	public static void main(String[] args) {
		
		//Brasil 1.000,00
		//EUA 1,000.00
		
		Locale en = new Locale("en", "United States");
		NumberFormat nf = NumberFormat.getInstance(en);
		
		String num = nf.format(100.99);
		System.out.println(num);
		
		Locale br = new Locale("pt", "Brazil");
		nf = NumberFormat.getInstance(br);
		
		num = nf.format(100.99);
		System.out.println(num);
		
		
		
		//Moeda
		NumberFormat moeda = NumberFormat.getCurrencyInstance(Locale.getDefault());
		
		String valor = moeda.format(100.99);
		System.out.println(valor);
		
		Currency currency = moeda.getCurrency();
		System.out.println(currency);
		
		
		// PORCENTAGEM
		NumberFormat porcent = NumberFormat.getPercentInstance();
		String porcentagem = porcent.format(99.987);
		System.out.println(porcentagem);
		
		porcent.setMaximumIntegerDigits(7);
		porcent.setMinimumIntegerDigits(5);
		
		porcent.setMaximumFractionDigits(2);
		porcent.setMinimumFractionDigits(1);
		
		porcentagem = porcent.format(99.987);
		System.out.println(porcentagem);
		
		// ARREDONDAMENTO
		
		nf = NumberFormat.getInstance(Locale.getDefault());
		
		nf.setRoundingMode(RoundingMode.UP);
		nf.setMaximumFractionDigits(0);
		nf.setMinimumFractionDigits(0);
		System.out.println(nf.format(99.50));
		
		Number numero = null;
		
		try {
			numero = nf.parse("100.00");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		System.out.println(numero.intValue());
	}

}
