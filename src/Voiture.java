public class Voiture {
    private String marque;
    private String modele ;
    private int annee;
    private int kilometrage;

    // constructeur par défaut
    public Voiture() {}

    // constructeur avec parametre
    public Voiture( String marque, String modele, int annee, int kilometrage)
    {
        this.marque=marque;
        this.modele=modele;
        this.annee=annee;
        this.kilometrage=kilometrage;
    }
    // géneration de getters
    public String getMarque() {
        return marque;
    }

    public String getModele() {
        return modele;
    }

    public int getAnnee() {
        return annee;
    }
    // géneration de setters

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    // création des méthodes
   public void afficherInfos()
    {
        System.out.println("la marque est : "+marque+" le modéle est : "+modele+" année : "+annee+" kilometrage :"+kilometrage+" Km");
    }
    //
    public int rouler(int km)
    {
        if(kilometrage<=0)
        {
            System.out.println("Erreur la voiture est en repos ");
        }
        this.kilometrage +=km;
        return kilometrage;
    }

    // get et set de kilometrage
    public void setKilometrage(int km) {
        this.kilometrage = km;
    }

    public int getKilometrage() {
        return kilometrage;
    }
}
