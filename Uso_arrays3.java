
public class Uso_arrays3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [][] matrix= {
		{10,15,18,19,21},
		{5,25,52,89,90},
		{7,19,31,14,90},
		{85,2,7,21,40}
};



//System.out.println("valor almacenado en la posicion 2, 3 " + matrix[2][3]);
/*for (int i=0; i<4; i++) {
	System.out.println();
	
	for(int j=0; j<5; j++) {
		System.out.print(matrix[i][j] + " ");
	}
}*/
for(int[]fila:matrix) {
	System.out.println();
	for(int z:fila) {
		System.out.print(z + " ");
	}
}
	}

}
