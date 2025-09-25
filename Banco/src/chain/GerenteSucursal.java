package chain;

//Gerente de Sucursal
public class GerenteSucursal extends EmpleadoBanco {

	public void manejarSolicitud(String solicitud) {
		if (solicitud.equalsIgnoreCase("prestamo hipotecario") || solicitud.equalsIgnoreCase("credito comercial")
				|| solicitud.equalsIgnoreCase("queja importante")) {
			System.out.println("Gerente de Sucursal atiende: " + solicitud);
		} else if (siguiente != null) {
			siguiente.manejarSolicitud(solicitud);
		}
	}
}
