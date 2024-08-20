public class Canard implements Volant,Nageant {
    public void voler()
    {
        System.out.println("je peux voler");
    }

    @Override
    public void nager() {
        System.out.println("je peux bien nager ");
    }
}
