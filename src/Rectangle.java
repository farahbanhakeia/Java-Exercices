public class Rectangle extends Forme {
    private double longueur;
    private double lar;

    // constructeur
    public Rectangle(double longueur, double lar) {
        this.longueur = longueur;
        this.lar = lar;
    }

    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public double getLar() {
        return lar;
    }

    public void setLar(double lar) {
        this.lar = lar;
    }


    @Override
    public double calculerSurface(){
        return longueur*lar;
    }
    @Override
    public double calculerPerimetre()
    {
        return 2*(lar+longueur);
    }

    @Override
    public void afficherDetails(){
        System.out.println("je suis un rectangle");
        System.out.println("ma longueur : "+longueur+"ma largeur "+lar);
        System.out.println("la surface en "+calculerSurface());
        System.out.println("le perimetre est "+calculerPerimetre());
    }
}
