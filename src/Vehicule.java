public interface Vehicule {
    void demarer(); // par defaut abstraites
    default void arreter()
    {
        System.out.println("le Vehicule est arreté ");
    };
}
