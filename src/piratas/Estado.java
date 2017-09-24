package piratas;

public abstract class Estado {

	protected EstadoPirata estadoPirata;

	public abstract Estado beberGrog();

	public abstract Estado beberJugo();

	public EstadoPirata getEstadoPirata() {
		return this.estadoPirata;
	}

	public abstract int setAtaque();
	
	public abstract int setDefensa();
	
}
