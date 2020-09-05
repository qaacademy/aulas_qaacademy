package utils;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Utilidades {
	static DecimalFormat formatter = new DecimalFormat("########.##"); 	
	
	public static String formatarDouble(double valor) {
		return formatter.format(valor);
	}

}
