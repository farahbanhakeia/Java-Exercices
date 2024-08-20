
public class MainAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal("vache", 4);
        animal.parler();
        animal.manger();

        // utlisation du polymorphisme

        // exemple de chien
        Animal chien = new Chien("jack",3);
        chien.manger();
        chien.parler();

        // exemple de chat

        Animal chat = new Chat("minouch",1);
        chat.manger();
        chat.parler();




    }
}