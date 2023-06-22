package primerosPasos;

public class EjercicioMatriz {

	public static void main(String[] args) {
		
		for (int fila = 0; fila <= 10; fila++) {
			for (int columna = 0; columna < fila; columna++) {				
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}	
	}	
}

/*Solución del intructor

class MultiplosDeTresHastaCien {

    public static void main (String[] args) {
        for (int i = 1; i < 100; i++ ){
            if (i % 3 == 0)    {
                System.out.println(i);
            }
        }
    }

}

class MultiplosDeTresHastaCien {

    public static void main (String[] args) {
        for (int i = 3; i < 100; i += 3 ){
            System.out.println(i);
        }
    }

}*/