package chain;

//Vicepresidente
public class Vicepresidente extends EmpleadoBanco {

	public void manejarSolicitud(String solicitud) {
		if (solicitud.equalsIgnoreCase("fusion") || solicitud.equalsIgnoreCase("politica institucional")
				|| solicitud.equalsIgnoreCase("caso legal mayor")) {
			System.out.println("Vicepresidente atiende: " + solicitud);
		} else {
			System.out.println("Nadie pudo atender la solicitud: " + solicitud);
		}
	}
}
