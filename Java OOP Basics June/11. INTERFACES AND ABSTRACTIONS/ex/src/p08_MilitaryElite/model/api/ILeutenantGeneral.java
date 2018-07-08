package p08_MilitaryElite.model.api;

public interface ILeutenantGeneral extends IPrivate {
    Iterable<ISoldier> getPrivates();

    void addPrivate(ISoldier priv);
}
