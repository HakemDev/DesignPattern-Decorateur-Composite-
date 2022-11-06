package exercice1.Decorator;

import exercice1.Component.Assurance;

public abstract class Decorator extends Assurance {
    protected Assurance assurance;

    public Decorator(Assurance assurance) {
        this.assurance = assurance;
    }
}
