import java.util.Scanner;

public class prueba {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce tu nombre, por favor: ");
		String nombre_usuario=entrada.nextLine();
		System.out.println("Introduce edad, por favor:");
		int edad=entrada.nextInt();
		System.out.println("Hola " + nombre_usuario + " El a�o proximo tendras " + (edad+1) + " a�os");
	}
	

}
