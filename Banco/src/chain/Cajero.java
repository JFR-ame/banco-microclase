package chain;

//Cajero
public class Cajero extends EmpleadoBanco {

	public void manejarSolicitud(String solicitud) {
		if (solicitud.equalsIgnoreCase("consulta saldo") || solicitud.equalsIgnoreCase("deposito")
				|| solicitud.equalsIgnoreCase("retiro menor")) {
			System.out.println("Cajero atiende: " + solicitud);
		} else if (siguiente != null) {
			siguiente.manejarSolicitud(solicitud);
		}
	}
}
