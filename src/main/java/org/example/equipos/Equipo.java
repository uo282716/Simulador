package org.example.equipos;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class Equipo implements Comparable<Equipo> {
	
	public String nombre;
	
	public int puntos;
	
	public List<Enfrentamiento> enfrentamientos;

	public HashMap<String, Integer> resultados = new HashMap<>();

	public Equipo(String nombre, int puntos, List<Enfrentamiento> enfrentamientos) {
		super();

		resultados.put("1", 0);
		resultados.put("2", 0);
		resultados.put("3", 0);
		resultados.put("4", 0);
		resultados.put("5", 0);
		resultados.put("6", 0);
		resultados.put("7", 0);
		resultados.put("8", 0);
		resultados.put("9", 0);
		resultados.put("10", 0);
		resultados.put("DES", 0);

		this.nombre = nombre;
		this.puntos = puntos;
		this.enfrentamientos = enfrentamientos;
	}
	
	public void calcularPuntos() {
		puntos = 0;
		for(Enfrentamiento e : enfrentamientos) {
			if(e.local.equals(this)) {
				if(e.ganadorLocal) {
					puntos++;
				} 
			} else {
				if(!e.ganadorLocal) {
					puntos++;
				} 
			}
		}
	}
	
	@Override
	public String toString() {
		return nombre + " - " + puntos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(enfrentamientos, nombre, puntos);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipo other = (Equipo) obj;
		return Objects.equals(nombre, other.nombre);
	}
	// a negative integer, zero, or a positive integer as this objectis less than, equal to, or greater than the specified object.

	@Override
	public int compareTo(Equipo o) {
		if(o.puntos > this.puntos) {
			return 1;
		} else if(o.puntos < this.puntos) {
			return -1;
		} else {
			for(Enfrentamiento f : enfrentamientos) {
				if(f.local.equals(o) && f.visitante.equals(this)) {
					if(f.ganadorLocal) {
						return -1;
					} else {
						return 1;
					}
				} else if(f.visitante.equals(o) && f.local.equals(this)) {
					if(f.ganadorLocal) {
						return 1;
					} else {
						return -1;
					}
				}
			}
		}
		
		return 0;
	}


    public void calcularPosicion(List<Equipo> equipos) {
		int pos = equipos.indexOf(this) + 1;

		if(equipos.get(8).puntos == equipos.get(7).puntos){
			if(puntos == equipos.get(8).puntos){
				resultados.put("DES", resultados.get("DES") + 1);
			} else{
				resultados.put(String.valueOf(pos), resultados.get(String.valueOf(pos)) + 1);
			}
		} else{
			resultados.put(String.valueOf(pos), resultados.get(String.valueOf(pos)) + 1);

		}
    }
}
