public class Chat extends Animal {

    public  Chat(String nom, int age)
    {
        super(nom,age);
    }
    @Override
    protected void parler(){
        System.out.println(" je  suis miaw miaw ");
    }
    protected void manger(){
        System.out.println(" je mange du paté et des poissons ");
    }



}
