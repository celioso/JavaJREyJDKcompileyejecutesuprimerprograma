package primerosPasos;

public class Factorial {
		public static void main(String[] args) {
		    for (int n = 1; n <= 10; n++) {
		        int factorial = 1;
		        for (int i = 1; i <= n; i++) {
		            factorial *= i;
		        }
		        System.out.println("El factorial de " + n + "! es: " + factorial);
		    }
		}

}
