
public class manipula_cadenas2 {

	public static void main(String[] args) {
		String frase="hoy es un gran dia para aprender a programar en Java";
		String frase_resumen=frase.substring(0,29 ) + " irnos a la playa" +
				frase.substring(2,26);
		System.out.println(frase_resumen);
		

	}

}
