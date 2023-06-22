package primerosPasos;

public class CalculoDelValorConDescuento {
	public static void main(String[] args) {
	double compra = 40;
	
	if (compra >= 100 && compra <= 199.99) {
		double pago = (compra - (compra*0.1));
		System.out.println("Su total es $"+pago +", octuvo un 10% de descuento por su compra.");
	}
	else if (compra >= 200.0 && compra <= 299.99) {
		double pago = (compra - (compra*0.15));
		System.out.println("Su total es $"+pago +", octuvo un 15% de descuento por su compra.");
	}
	
	else if (compra >= 300.0) {
		double pago = (compra - (compra*0.2));
		System.out.println("Su total es $"+pago +", octuvo un 20% de descuento por su compra.");
	}
	else {
		System.out.println("Su total es $"+compra);
	}
	}
}


//Solucion del tutor

/*public class TestDescuento {

    public static void main(String[] args) {

        double valorCompra = 250.0;
        double descuento = 0.0;

        if (valorCompra >= 100.0 && valorCompra < 200.0) {
            descuento = 10.0;
        } else if (valorCompra >= 200.0 && valorCompra < 300.0) {
            descuento = 15.0;
        } else if (valorCompra >= 300.0) {
            descuento = 20.0;
        }

        double valorFinal = valorCompra - (valorCompra * (descuento / 100));

        System.out.println("Valor de la compra: $" + valorCompra);
        System.out.println("Descuento: " + descuento + "%");
        System.out.println("Valor final: $" + valorFinal);
    }
}*/