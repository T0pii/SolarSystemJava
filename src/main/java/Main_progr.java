import librairies.StdDraw;
import java.awt.*;
import java.util.concurrent.TimeUnit;

import static java.awt.Color.BLACK;


public class Main_progr {

    public static void main(String[] args) {
        long tempsEnJours = 0;
        long nbrMois = 0;
        long nbrAnnee = 0;
        int countMois;

        StdDraw.setCanvasSize(800, 800);
        StdDraw.setPenRadius(0.1);
        StdDraw.setFont(new Font("Arial", Font.BOLD, 20));
        StdDraw.setPenColor(Color.WHITE);
        StdDraw.clear(BLACK);
        StdDraw.text(0.5,0.95,"Temps écoulé : " + nbrAnnee + "a " + nbrMois + "m " + tempsEnJours + "j");

        while(true){
            try {
                TimeUnit.MILLISECONDS.sleep(100);
                StdDraw.filledRectangle(1,1,1,0.1);
                StdDraw.setPenColor(BLACK);
                TimeUnit.MILLISECONDS.sleep(1);
                tempsEnJours = tempsEnJours + 1;


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
                StdDraw.text(0.5,0.95,"Temps écoulé : " + nbrAnnee + "a " + nbrMois + "m " + tempsEnJours + "j");

                StdDraw.setPenRadius(0.01);
                StdDraw.setPenColor(Color.WHITE);
                StdDraw.filledCircle(0.5,0.5,0.10);
                StdDraw.setPenRadius(0.1);
            }  catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}
