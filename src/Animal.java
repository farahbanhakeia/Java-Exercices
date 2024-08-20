public class Animal {
    protected String nom;
    protected int age;

    // constructeur par défaut

    public Animal(){}

    // constructeur avec parametre

    public Animal( String nom, int age)
    {
        this.nom=nom;
        this.age=age;
    }

    // les getters et setters

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // méthode parler()

    protected void parler()
    {
        System.out.println("je suis un animal :) ");
    }
    // méthode manger()

    protected void manger()
    {
        System.out.println("je mange   ");
    }
}
