package p08_MilitaryElite.model.api;

public interface IEngineer extends ISpecialistISoldier {
    Iterable<IRepair> getRepairs();

    void addRepair(IRepair repair);
}
