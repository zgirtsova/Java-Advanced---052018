package p08_MilitaryElite.model.Impl.soldiers;

import p08_MilitaryElite.model.api.ISpecialistISoldier;

public abstract class SpecialistISoldier extends Private implements ISpecialistISoldier {
    private String corps;

    protected SpecialistISoldier(String id, String firstName, String lastName, double salary, String corps) {
        super(id, firstName, lastName, salary);
        this.corps = corps;
    }

    @Override
    public String getCorps() {
        return this.corps;
    }

    @Override
    public String toString() {
        return String.format("%s%nCorps: %s", super.toString(), this.corps);
    }
}
