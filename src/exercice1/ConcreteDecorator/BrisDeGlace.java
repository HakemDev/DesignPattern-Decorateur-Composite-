package exercice1.ConcreteDecorator;

import exercice1.Component.Assurance;
import exercice1.Decorator.Decorator;

public class BrisDeGlace extends Decorator {
    public BrisDeGlace(Assurance assurance) {
        super(assurance);
    }

    @Override
    public float frais() {
        return assurance.frais()+30;
    }
}
