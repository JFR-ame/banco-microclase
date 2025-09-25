package chain;

//Gerente Regional
public class GerenteRegional extends EmpleadoBanco {

	public void manejarSolicitud(String solicitud) {
		if (solicitud.equalsIgnoreCase("credito corporativo") || solicitud.equalsIgnoreCase("decision inversion")) {
			System.out.println("Gerente Regional atiende: " + solicitud);
		} else if (siguiente != null) {
			siguiente.manejarSolicitud(solicitud);
		}
	}
}