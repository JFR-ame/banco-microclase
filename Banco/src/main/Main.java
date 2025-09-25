package main;

import chain.AsesorComercial;
import chain.Cajero;
import chain.EmpleadoBanco;
import chain.GerenteRegional;
import chain.GerenteSucursal;
import chain.Vicepresidente;

//Cliente
public class Main {
	public static void main(String[] args) {
		// Crear cadena
		EmpleadoBanco cajero = new Cajero();
		EmpleadoBanco asesor = new AsesorComercial();
		EmpleadoBanco gerente = new GerenteSucursal();
		EmpleadoBanco regional = new GerenteRegional();
		EmpleadoBanco vicepresidente = new Vicepresidente();

		cajero.setSiguiente(asesor);
		asesor.setSiguiente(gerente);
		gerente.setSiguiente(regional);
		regional.setSiguiente(vicepresidente);

		// Pruebas
		cajero.manejarSolicitud("decision inversion");
		cajero.manejarSolicitud("prestamo hipotecario");
		cajero.manejarSolicitud("fusion");
		cajero.manejarSolicitud("solicitud inexistente");
	}
}