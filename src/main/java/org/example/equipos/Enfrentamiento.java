package org.example.equipos;

public class Enfrentamiento {
	
	public Equipo local;
	
	public Equipo visitante;
	
	public boolean ganadorLocal;

	public Enfrentamiento(Equipo local, Equipo visitante, boolean ganadorLocal) {
		super();
		this.local = local;
		this.visitante = visitante;
		this.ganadorLocal = ganadorLocal;
		
		
		local.enfrentamientos.add(this);
		visitante.enfrentamientos.add(this);
	}
	
	public Enfrentamiento(Equipo local, Equipo visitante) {
		super();
		this.local = local;
		this.visitante = visitante;
	}


}
