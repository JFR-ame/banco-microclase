package chain;

//Handler abstracto
public abstract class EmpleadoBanco {
	public EmpleadoBanco siguiente;

	public void setSiguiente(EmpleadoBanco siguiente) {
		this.siguiente = siguiente;
	}

	public abstract void manejarSolicitud(String solicitud);
}