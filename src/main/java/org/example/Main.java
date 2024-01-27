package org.example;

import org.example.equipos.Enfrentamiento;
import org.example.equipos.Equipo;
import org.example.equipos.Simulador;

import java.util.ArrayList;
import java.util.List;



public class Main {

    public static void main(String[] args) {

        Equipo FNC = new Equipo("Fnatic", 0, new ArrayList<>());
        Equipo G2 = new Equipo("G2", 0, new ArrayList<>());
        Equipo GX = new Equipo("GiantX", 0, new ArrayList<>());
        Equipo KC = new Equipo("Karmine Corp", 0, new ArrayList<>());
        Equipo MDK = new Equipo("MAD Lions Koi", 0, new ArrayList<>());
        Equipo RGE = new Equipo("Rogue", 0, new ArrayList<>());
        Equipo SK = new Equipo("SK Gaming", 0, new ArrayList<>());
        Equipo BDS = new Equipo("Team BDS", 0, new ArrayList<>());
        Equipo HRT = new Equipo("Team Heretics", 0, new ArrayList<>());
        Equipo VIT = new Equipo("Team Vitality", 0, new ArrayList<>());


        Enfrentamiento e1 = new Enfrentamiento(G2, BDS, true);
        Enfrentamiento e2 = new Enfrentamiento(SK, RGE, true);
        Enfrentamiento e3 = new Enfrentamiento(FNC, KC, true);
        Enfrentamiento e4 = new Enfrentamiento(GX, VIT, true);
        Enfrentamiento e5 = new Enfrentamiento(MDK, HRT, true);

        Enfrentamiento e6 = new Enfrentamiento(GX, BDS, false);
        Enfrentamiento e7 = new Enfrentamiento(MDK, SK, false);
        Enfrentamiento e8 = new Enfrentamiento(G2, KC, true);
        Enfrentamiento e9 = new Enfrentamiento(FNC, VIT, true);
        Enfrentamiento e10 = new Enfrentamiento(RGE, HRT, false);

        Enfrentamiento e11 = new Enfrentamiento(BDS, VIT, true);
        Enfrentamiento e12 = new Enfrentamiento(G2, RGE, false);
        Enfrentamiento e13 = new Enfrentamiento(GX, HRT, false);
        Enfrentamiento e14 = new Enfrentamiento(KC, MDK, false);
        Enfrentamiento e15 = new Enfrentamiento(FNC, SK, false);

        Enfrentamiento e16 = new Enfrentamiento(VIT, RGE, true);
        Enfrentamiento e17 = new Enfrentamiento(SK, HRT, false);
        Enfrentamiento e18 = new Enfrentamiento(MDK, G2, false);
        Enfrentamiento e19 = new Enfrentamiento(FNC, BDS, false);
        Enfrentamiento e20 = new Enfrentamiento(GX, KC, true);

        Enfrentamiento e21 = new Enfrentamiento(MDK, BDS, false);
        Enfrentamiento e22 = new Enfrentamiento(FNC, RGE, true);
        Enfrentamiento e23 = new Enfrentamiento(HRT, G2, false);
        Enfrentamiento e24 = new Enfrentamiento(SK, GX, true);
        Enfrentamiento e25 = new Enfrentamiento(VIT, KC, true);

        Enfrentamiento e26 = new Enfrentamiento(SK, BDS, false);
        Enfrentamiento e27 = new Enfrentamiento(FNC, GX, true);
        Enfrentamiento e28 = new Enfrentamiento(MDK, RGE, true);
        Enfrentamiento e29 = new Enfrentamiento(VIT, G2, true);
        Enfrentamiento e30 = new Enfrentamiento(HRT, KC, true);


        Enfrentamiento e31 = new Enfrentamiento(VIT, SK);
        Enfrentamiento e32 = new Enfrentamiento(HRT, BDS);
        Enfrentamiento e33 = new Enfrentamiento(FNC, MDK);
        Enfrentamiento e34 = new Enfrentamiento(GX, G2);
        Enfrentamiento e35 = new Enfrentamiento(KC, RGE);

        Enfrentamiento e36 = new Enfrentamiento(VIT, HRT);
        Enfrentamiento e37 = new Enfrentamiento(MDK, GX);
        Enfrentamiento e38 = new Enfrentamiento(FNC, G2);
        Enfrentamiento e39 = new Enfrentamiento(SK, KC);
        Enfrentamiento e40 = new Enfrentamiento(BDS, RGE);

        Enfrentamiento e41 = new Enfrentamiento(VIT, MDK);
        Enfrentamiento e42 = new Enfrentamiento(GX, RGE);
        Enfrentamiento e43 = new Enfrentamiento(BDS, KC);
        Enfrentamiento e44 = new Enfrentamiento(FNC, HRT);
        Enfrentamiento e45 = new Enfrentamiento(SK, G2);

        List<Enfrentamiento> partidos = new ArrayList<>();
        partidos.add(e31);
        partidos.add(e32);
        partidos.add(e33);
        partidos.add(e34);
        partidos.add(e35);
        partidos.add(e36);
        partidos.add(e37);
        partidos.add(e38);
        partidos.add(e39);
        partidos.add(e40);
        partidos.add(e41);
        partidos.add(e42);
        partidos.add(e43);
        partidos.add(e44);
        partidos.add(e45);


        List<Equipo> equipos = new ArrayList<>();
        equipos.add(FNC);
        equipos.add(G2);
        equipos.add(GX);
        equipos.add(KC);
        equipos.add(MDK);
        equipos.add(RGE);
        equipos.add(SK);
        equipos.add(BDS);
        equipos.add(HRT);
        equipos.add(VIT);

        Simulador sim = new Simulador();
        sim.simular(partidos, equipos);
    }



}
