package unlam.edu.ar.pb2;

public class CuentaSueldo {
	
	private Double saldo;
	
	public CuentaSueldo(Double saldo) {
		
		this.saldo=saldo;
	}
	
//	CuentaSueldo miSueldito = new CuentaSueldo(4000.00);
	
	public Double getSaldo() {
		return saldo;
	}



	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}



	public void extracionCuenta(Double extracion) {
		
		if(extracion<getSaldo()) {
			
			setSaldo(getSaldo()-extracion);
		}
		else
		{
			System.out.println("Error al realizar la extracion, por favor verifique que usted posee esa cantidad en su cuenta bancaria");
		}
		
	}
	
	public void depositarCuenta(Double deposito) {
		setSaldo(deposito);
	}
}
