package p01_weekdays;

import java.util.Comparator;

public class WeeklyEntry {

    public static final Comparator<WeeklyEntry> WEEKLY_ENTRY_COMPARATOR_BY_DAY_ASC = createComparatorByDayAsc();

    private Weekday weekday;
    private String notes;

    public WeeklyEntry(String weekday, String notes) {
        this.setWeekday(weekday);
        this.setNotes(notes);
    }

    private static Comparator<WeeklyEntry> createComparatorByDayAsc() {
        //return Comparator.comparing(WeeklyEntry::getWeekday);
        // or this:
        return Comparator.comparing(e -> e.getWeekday().ordinal());
    }

    public Weekday getWeekday() {
        return this.weekday;
    }

    private void setWeekday(String weekday) {
        this.weekday = Enum.valueOf(Weekday.class, weekday.toUpperCase());
    }

    public String getNotes() {
        return this.notes;
    }

    private void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return String.format("%s - %s", this.weekday.toString(), this.notes);
    }
}
