package p08_MilitaryElite.model.api;

public interface ICommando extends ISpecialistISoldier {
    Iterable<IMission> getMissions();

    void addMission(IMission mission);
}
