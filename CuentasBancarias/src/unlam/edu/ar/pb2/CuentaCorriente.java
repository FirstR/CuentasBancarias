package unlam.edu.ar.pb2;

public class CuentaCorriente extends CuentaSueldo {
	
	public Double guitadescubierto;
	
	public CuentaCorriente(Double guitadescubierto, Double saldo) {
		super(saldo);
		this.guitadescubierto=guitadescubierto;
	}

	public Double getGuitadescubierto() {
		return guitadescubierto;
	}

	public void setGuitadescubierto(Double guitadescubierto) {
		this.guitadescubierto = guitadescubierto;
	}
	
@Override
	
	public void extracionCuenta(Double extracion) {
		if(extracion<getSaldo()) {
			
				setSaldo(getSaldo()-extracion);
			}
		
			else
			{	
				if(extracion<(guitadescubierto+getSaldo())) {
				Double aux = extracion-getSaldo();
				Double extraciondesc = extracion +(5*(aux/100)); //quiero que 5 sea una variable global, pero no sè bien como hacerlo.
				setSaldo(getSaldo()-extraciondesc);
				}
				else
				{
					System.out.println("Su extracion supera al maximo permitido por el banco");
				}
			}
	}

}
