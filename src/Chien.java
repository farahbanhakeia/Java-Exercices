public class Chien extends Animal {

    public  Chien(String nom, int age)
    {
        super(nom,age);
    }
    @Override
    protected void parler(){
        System.out.println(" je suis un chien ");
    }
    @Override
    protected void manger(){
        System.out.println(" je mange des os et de la viande  ");
    }



}
