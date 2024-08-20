public class Cercle extends Forme {
   private double rayon;

 //constructeur
    public Cercle(double rayon) {
        this.rayon = rayon;
    }
    //getters et setters

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }
    // calcul
    @Override
    public double calculerSurface(){
        return Math.PI*rayon*rayon;
    }
    @Override
    public double calculerPerimetre()
    {
        return 2*Math.PI*rayon;
    }
    @Override
    public void afficherDetails(){
        System.out.println("je suis un cercle");
        System.out.println("le rayon"+rayon);
        System.out.println("la surface en "+calculerSurface());
        System.out.println("le perimetre est "+calculerPerimetre());
    }
}
