package p08_MilitaryElite.model.Impl.soldiers;

import p08_MilitaryElite.model.api.ILeutenantGeneral;
import p08_MilitaryElite.model.api.ISoldier;

import java.util.*;

public class LeutenantGeneral extends Private implements ILeutenantGeneral {
    private Set<ISoldier> privates;

    public LeutenantGeneral(String id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName, salary);
        this.privates = new TreeSet<>();
    }

    @Override
    public Iterable<ISoldier> getPrivates() {
        return this.privates;
    }

    @Override
    public void addPrivate(ISoldier priv) {
        this.privates.add(priv);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(System.lineSeparator()).append("Privates:");
        this.privates.forEach(p -> sb.append(System.lineSeparator()).append("  ").append(p));
        return sb.toString();
    }
}
