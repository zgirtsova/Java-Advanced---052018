package p08_MilitaryElite.model.Impl.soldiers;

import p08_MilitaryElite.model.api.ISpy;

public class Spy extends BaseISoldier implements ISpy {
    private String codeNumber;

    public Spy(String id, String firstName, String lastName, String codeName) {
        super(id, firstName, lastName);
        this.codeNumber = codeName;
    }

    @Override
    public String getCodeNumber() {
        return this.codeNumber;
    }

    @Override
    public String toString() {
        return String.format("%s%nCode Number: %s", super.toString(), this.getCodeNumber());
    }
}
