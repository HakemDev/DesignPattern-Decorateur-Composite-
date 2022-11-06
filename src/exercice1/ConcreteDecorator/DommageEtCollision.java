package exercice1.ConcreteDecorator;

import exercice1.Component.Assurance;
import exercice1.Decorator.Decorator;

public class DommageEtCollision extends Decorator {
    public DommageEtCollision(Assurance assurance) {
        super(assurance);
    }

    @Override
    public float frais() {
        return assurance.frais()+50;
    }
}
