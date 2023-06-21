package primerosPasos;

public class TiposVariables {
	
	public static void main(String[] args) {
		/*System.out.println("Hola Mundo!!!");
		int edad = 28;
		System.out.println(edad);
		
		edad = 47;
		System.out.println(edad);
		
		edad = 46 + 88;
		System.out.println("Mi edad es "+edad);
		
		edad = 37;
        System.out.println("La edad es "+ edad + ", Felicitaciones!");*/
        
        /*double salario = 1250.50;
        System.out.println(salario);
        
        double edad = 28;
        double salarioMitad = salario/2;
        System.out.println(salarioMitad);
        
        int division = 1250/3;
        System.out.println(division);*/
		
		double variable1 = 230.89;
		int variable1Entero = (int) variable1; //cast
		//Este metodo imprime en consola
		System.out.println(variable1Entero);
		
		long prueba = 122222222222222222L; //Para numeros grandes
		short numeroPequeno= 12555;
		byte numeroAunMasPequeño = 15;
		float numeroDecimalPequeno = 2.5F;
		
		double resultado = (int)variable1 + variable1Entero;
		System.out.println(resultado);
        
	}
}
