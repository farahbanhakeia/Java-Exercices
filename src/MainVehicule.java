public class MainVehicule {
    public static void main(String[] args) {
       Vehicule moto = new Moto();

        System.out.println("**********************************");
        System.out.println("le suis la Moto");
        moto.arreter();
        moto.demarer();

       Vehicule voiture = new Voiture2();

        System.out.println("**********************************");
        System.out.println("le suis la voiture");
        voiture.demarer();
        voiture.arreter();


    }
}
