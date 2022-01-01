package systemeSolaire;

import java.awt.*;

public class Planète extends Astre {
    private float distance;
    private float revolution;

    public Planète(String nom, Color couleur,float rayon,float distance,float revolution) {
        super(nom,couleur,rayon);
        this.distance=distance;
        this.revolution=revolution;
    }

    public float getDistance() {
        return distance;
    }

    public float getRevolution() {
        return revolution;
    }

    public void afficheToi(Astre astre) {
        StdDraw.setPenColor(astre.getCouleur());
    }

}

