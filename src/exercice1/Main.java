package exercice1;

import exercice1.Component.Assurance;
import exercice1.ConcreteCompenent.ConcreteAssurance;
import exercice1.ConcreteDecorator.BrisDeGlace;
import exercice1.ConcreteDecorator.Inondation;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args){
        ConcreteAssurance concreteAssurance=new ConcreteAssurance();

        Assurance inondation=new Inondation(concreteAssurance);
        Assurance bris_de_glace=new BrisDeGlace(concreteAssurance);
        System.out.println("les frais d'inondation est: "+inondation.frais());
        System.out.println("les frais de bris de glace est: "+bris_de_glace.frais());

    }
}
