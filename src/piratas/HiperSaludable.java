package piratas;

public class HiperSaludable extends Estado {

	private static final int ATAQUE = 10;
	private static final int DEFENSA = -2;

	public HiperSaludable() {
		this.estadoPirata = EstadoPirata.HIPERSALUDABLE;
	}

	@Override
	public Estado beberGrog() {
		return new Saludable();
	}

	@Override
	public Estado beberJugo() {
		return this;
	}

	@Override
	public int setAtaque() {
		return ATAQUE;
	}

	@Override
	public int setDefensa() {
		return DEFENSA;
	}

}
