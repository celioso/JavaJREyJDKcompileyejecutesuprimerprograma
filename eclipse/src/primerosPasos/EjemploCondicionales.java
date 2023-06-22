package primerosPasos;

public class EjemploCondicionales {
	public static void main(String[] args) {
		System.out.println("Helo world");
		 int edad = 18;
		 int cantidad = 2;
		 
		 if (edad >= 18) {
			 System.out.println("Usted pueda entrar");
			 System.out.println("Bienvenido");
		 }
		 
		 else {
			 if (cantidad >= 2) {
				 System.out.println("Usted es menor de "
						 +"edad pero esta peritido du ingreso");
			 }
			 else {
			 System.out.println("Usted no esta permitido a " 
			 +"ingresar");
			 }
		 }
	}
}
