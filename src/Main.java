
public class Main {
    public static void main(String[] args) {
     Voiture v1 = new Voiture();
     v1.afficherInfos();
<<<<<<< HEAD

=======
        
      // exemple voiture 2
        
>>>>>>> 2dc5d594630a7b5edf89b59b3ee9a8553dec206e
     Voiture v2 = new Voiture("Dacia","XRE-3",2002,190);
     v2.afficherInfos();
     System.out.println("vouvelle ajout du kimoletrage : "+v2.rouler(30));
     v2.setKilometrage(20);
     System.out.println("le derniére modifcation du kilometrage :"+v2.getKilometrage());



    }
}
