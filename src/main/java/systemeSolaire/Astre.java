package systemeSolaire;
import librairies.StdDraw;

import java.awt.*;

public abstract class Astre {
    protected String nom;
    protected Color couleur;
    protected double rayon;
    protected double x;
    protected double y;

    public Astre(String nom, Color couleur, double rayon, double x, double y) {
        this.nom=nom;
        this.couleur=couleur;
        this.rayon=rayon;
        this.x=x;
        this.y=y;
    }


    public String getNom() {
        return nom;
    }

    public Color getCouleur() {
        return couleur;
    }

    public double getRayon() {
        return rayon;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void afficheToi() {
        StdDraw.setPenColor(this.getCouleur());
        StdDraw.filledCircle(this.getX(),this.getY(),this.getRayon());
    }

    @Override
    public String toString() {
        return "Astre{" +
                "nom='" + nom + '\'' +
                ", couleur=" + couleur +
                ", rayon=" + rayon +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}