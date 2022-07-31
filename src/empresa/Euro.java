package empresa;

public class Euro extends Moeda {

	
	
	public Euro() {
	}

	public Euro(double valor) {
		super(valor);
		
	}

	public void info() {

	}

	
	@Override
	public double converter(double valor) {
		return valor * 10;

	}

	@Override
	public String toString() {
		return "Euro";
	}
	
	
	
	
}