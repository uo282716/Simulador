package org.example.equipos;

import java.util.List;

public class Simulador {

    int x = 0;

    public void simular(List<Enfrentamiento> partidos, List<Equipo> equipos) {
        int i = 0;

        simularR(i, partidos, equipos);

        printear(equipos);
    }

    public void printear(List<Equipo> equipos){
        for (Equipo e : equipos) {
            System.out.println(e.nombre);
            for(String s : e.resultados.keySet()){
                System.out.println(s + ";" + e.resultados.get(s));
            }
        }
    }

    public void simularR(int i, List<Enfrentamiento> partidos, List<Equipo> equipos) {
        if(i == partidos.size()) {
            x++;

            for(Equipo e : equipos) {
                e.calcularPuntos();
            }

            equipos.sort(null);

            for (Equipo e : equipos) {
                e.calcularPosicion(equipos);
            }

        } else {
                partidos.get(i).ganadorLocal = true;
                partidos.get(i).local.enfrentamientos.add(partidos.get(i));
                partidos.get(i).visitante.enfrentamientos.add(partidos.get(i));

                simularR(i + 1, partidos, equipos);

                partidos.get(i).ganadorLocal = false;

                simularR(i + 1, partidos, equipos);

                partidos.get(i).local.enfrentamientos.remove(partidos.get(i).local.enfrentamientos.size() - 1);
                partidos.get(i).visitante.enfrentamientos.remove(partidos.get(i).visitante.enfrentamientos.size() - 1);
        }


    }
}
