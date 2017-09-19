package unlam.edu.ar.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuentaBancariasTest {

	@Test
	public void testCuentaSueldo() {
		
		CuentaSueldo cuenta = new CuentaSueldo(0.0);
		cuenta.depositarCuenta(4000.00);
		cuenta.extracionCuenta(500.0);
		Double saldo = cuenta.getSaldo();
		cuenta.extracionCuenta(4000.0);
		assertEquals(3500.00, saldo, 0.1);
	}
	
	@Test
	public void testCajaDeAhorros() {
		
		CajaDeAhorros misAhorritos = new CajaDeAhorros(0.0);
		misAhorritos.depositarCuenta(4000.00);
		misAhorritos.extracionCuenta(300.00);
		misAhorritos.extracionCuenta(300.00);
		misAhorritos.extracionCuenta(300.00);
		misAhorritos.extracionCuenta(300.00);
		misAhorritos.extracionCuenta(300.00);
		misAhorritos.extracionCuenta(300.00);
		Double saldo = misAhorritos.getSaldo();
		assertEquals(2194.00, saldo, 0.0); //despues de la quinta extracion se le aplica el aumento. Normal: 4000-(300*6)=2200
	}	
	
	@Test
	public void testCuentaCorriente() {
		
		CuentaCorriente miCuentita = new CuentaCorriente(0.0,0.0);
		miCuentita.depositarCuenta(100.00);
		miCuentita.setGuitadescubierto(50.00);
		miCuentita.extracionCuenta(110.00);
		Double saldo = miCuentita.getSaldo();
		assertEquals(-10.05, saldo, 0.0); // supongamos que el signo negativo se refiere a cuanto le debemos al banco.
		
	}
	}
