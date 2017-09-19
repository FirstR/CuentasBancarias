package unlam.edu.ar.pb2;

public class CajaDeAhorros extends CuentaSueldo {
	
	public Integer contador=0;
	
	public CajaDeAhorros(Double saldo) {
		super(saldo);
		
	}
	
	@Override
	
	public void extracionCuenta(Double extracion) {
		if(extracion<getSaldo()) {
			
				setSaldo(getSaldo()-extracion);
				this.contador++;
				if(this.contador>5) {
					setSaldo(getSaldo()-6);
				}
			}
			else
			{
				System.out.println("Error al realizar la extracion, por favor verifique que usted posee esa cantidad en su cuenta bancaria");
			}
	}
	

}
