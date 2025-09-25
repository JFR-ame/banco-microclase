package chain;

//Asesor Comercial
public class AsesorComercial extends EmpleadoBanco {

	public void manejarSolicitud(String solicitud) {
		if (solicitud.equalsIgnoreCase("apertura cuenta") || solicitud.equalsIgnoreCase("prestamo pequeño")
				|| solicitud.equalsIgnoreCase("tarjeta credito")) {
			System.out.println("Asesor Comercial atiende: " + solicitud);
		} else if (siguiente != null) {
			siguiente.manejarSolicitud(solicitud);
		}
	}
}