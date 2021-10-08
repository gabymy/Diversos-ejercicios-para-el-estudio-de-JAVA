import java.util.*;
public class evalua_edad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		System.out.println("introduce tu edad, por favor");
		
		int edad=entrada.nextInt();
		
		//if (edad>=18) {
			//System.out.println("Eres mayor de edad");
			
		//}
		//else {
			//System.out.println("Sos menor de edad");
			
//		}

		if (edad<18) {
			System.out.println("Eres un adolescente");
			
		}
		else if(edad<65){
			System.out.println("Eres un adulto");
		}
		
		else {
			System.out.println("Cuidate");
			
		}
	}

}
