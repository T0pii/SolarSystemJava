import librairies.StdDraw;
import systemeSolaire.Etoile;
import systemeSolaire.Planète;

import java.util.Arrays;
import java.util.List;
import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Main_progr {

    public static void main(String[] args) {
        long tempsEnJours = 0;
        long nbrMois = 0;
        long nbrAnnee = 0;
        int countMois;

        //Initialisation du canvas de dessin
        StdDraw.setScale(0,10);
        StdDraw.setCanvasSize(700, 700);
        StdDraw.setPenRadius(0.1);
        StdDraw.setFont(new Font("Arial", Font.BOLD, 20));

        //Initialisation des astres
        Etoile soleil = new Etoile("Soleil",Color.YELLOW,0.35,5,5);
        List<Planète> planètes;
        planètes= Arrays.asList(
                new Planète("Mercure",Color.DARK_GRAY,0.05,0.5,87.96),
                new Planète("Vénus",Color.LIGHT_GRAY,0.11,0.80,224.69),
                new Planète("Terre",Color.GREEN,0.11,1.2,365.256),
                new Planète("Mars",Color.RED,0.06,1.5,686.97),
                new Planète("Jupiter",Color.ORANGE,0.26,1.9,4332.589),
                new Planète("Saturne",Color.YELLOW,0.25,2.5,10759.23),
                new Planète("Uranus",Color.CYAN,0.2,3.25,30685.4),
                new Planète("Neptune",Color.BLUE,0.2,4,60216.8)
        );


        while(true){
            try {
                StdDraw.setScale(0,10);
                StdDraw.enableDoubleBuffering();
                TimeUnit.MILLISECONDS.sleep(100);

                tempsEnJours = tempsEnJours + 2;
                if( (nbrMois+1) % 2 == 0 || nbrMois!= 2){
                    countMois = 31;
                }else if(nbrMois == 2){
                    countMois = 28;
                }else{
                    countMois = 30;
                }
                if(tempsEnJours > countMois){
                    nbrMois = nbrMois + 1;
                    tempsEnJours = tempsEnJours - countMois;
                }
                if(nbrMois > 12){
                    nbrAnnee = nbrAnnee + 1;
                    nbrMois = nbrMois - 12;
                }

                StdDraw.clear(Color.BLACK);
                StdDraw.setPenColor(Color.BLACK);
                StdDraw.filledRectangle(10,10,10,1);
                StdDraw.setPenColor(Color.WHITE);
                StdDraw.text(5,9.5,"Temps écoulé : " + nbrAnnee + "a " + nbrMois + "m " + tempsEnJours + "j");

                soleil.afficheToi();
                for(Planète p:planètes) {
                    p.afficheTonOrbite();
                    p.afficheToi();
                    p.deplaceToi(soleil);
                }
                StdDraw.show();
                StdDraw.disableDoubleBuffering();

            }  catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}