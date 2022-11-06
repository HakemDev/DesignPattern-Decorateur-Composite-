package exercice1.ConcreteDecorator;

import exercice1.Component.Assurance;
import exercice1.Decorator.Decorator;

public class Vol extends Decorator {
    public Vol(Assurance assurance) {
        super(assurance);
    }

    @Override
    public float frais() {
        return assurance.frais()+40;
    }
}
