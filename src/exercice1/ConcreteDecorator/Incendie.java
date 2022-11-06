package exercice1.ConcreteDecorator;

import exercice1.Component.Assurance;
import exercice1.Decorator.Decorator;

public class Incendie extends Decorator {
    public Incendie(Assurance assurance) {
        super(assurance);
    }

    @Override
    public float frais() {
        return assurance.frais()+20;
    }
}
