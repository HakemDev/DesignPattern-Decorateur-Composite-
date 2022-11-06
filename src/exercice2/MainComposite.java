package exercice2;

import exercice2.Composite.SousMission;
import exercice2.Leaf.Trajet;

public class MainComposite {
    public static void main(String[] args) {
        Trajet trajet1=new Trajet.TrajetBuilder()
                .withPtDepart("Agadir")
                .withPtArrive("Casa")
                .withDate_Depart("lundi a 8h du matin")
                .withDate_arrive("lundi a 14h")
                .withcout(1500)
                .build();

        Trajet trajet2=new Trajet.TrajetBuilder()
                .withPtDepart("Rabat")
                .withPtArrive("Tanger")
                .withDate_Depart("Mardi a 8h du matin")
                .withDate_arrive("Mardi a 14h")
                .withcout(1000)
                .build();

        SousMission sousMission=new SousMission();
        sousMission.addTrajet(trajet1);
        sousMission.addTrajet(trajet2);
        System.out.println("cout total est: "+sousMission.cout());
        trajet1.showMissionDetails();
    }


}
