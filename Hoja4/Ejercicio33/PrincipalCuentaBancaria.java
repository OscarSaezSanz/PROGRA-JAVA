package Ejercicio33;

public class PrincipalCuentaBancaria {

	public static void main(String[] args) {
	CuentaBancaria cuenta1 = new CuentaBancaria ();
	cuenta1.depositar(1000);
	cuenta1.retirar(200);
	System.out.println("El Saldo de su cuenta es de: " +cuenta1.getSaldo()+"$");
	}
}
