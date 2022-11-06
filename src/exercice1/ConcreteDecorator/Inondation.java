package exercice1.ConcreteDecorator;

import exercice1.Component.Assurance;
import exercice1.Decorator.Decorator;

public class Inondation extends Decorator {
    public Inondation(Assurance assurance) {
        super(assurance);
    }

    @Override
    public float frais() {
        return assurance.frais()+10;
    }
}
