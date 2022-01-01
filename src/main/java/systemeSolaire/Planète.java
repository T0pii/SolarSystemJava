package systemeSolaire;

import librairies.StdDraw;

import java.awt.*;

public class Planète extends Astre {
    private double distance;
    private double revolution;

    public Planète(String nom, Color couleur,double rayon,double distance,double revolution) {
        super(nom,couleur,rayon,distance+5,5);
        this.distance=distance;
        this.revolution=revolution;
    }

    public double getDistance() {
        return distance;
    }

    public double getRevolution() {
        return revolution;
    }

    public void modifieTesCoords(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void deplaceToi() {

    }

    public void afficheTonOrbite() {
        StdDraw.setPenColor(Color.WHITE);
        StdDraw.setPenRadius(0.001);
        //StdDraw.circle(0.5,0.5,this.getDistance());
        StdDraw.circle(5,5,this.getDistance());
    }

    public void afficheToi() {
        super.afficheToi();
    }

    @Override
    public String toString() {
        return "Planète{" + super.toString() +
                "distance=" + distance +
                ", revolution=" + revolution +
                '}';
    }
}

