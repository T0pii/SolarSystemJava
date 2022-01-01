package systemeSolaire;
import java.awt.*;

public class Astre {
    protected String nom;
    protected Color couleur;
    protected float diametre;

    public Astre(String nom, Color couleur, float rayon) {
        this.nom=nom;
        this.couleur=couleur;
        this.diametre=rayon;
    }

    public Astre() {
        this("Astre", Color.WHITE, 10000);
    }

    public String getNom() {
        return nom;
    }

    public Color getCouleur() {
        return couleur;
    }

    public float getDiametre() {
        return diametre;
    }
}