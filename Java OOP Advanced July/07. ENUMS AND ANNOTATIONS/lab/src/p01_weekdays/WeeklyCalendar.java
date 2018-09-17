package p01_weekdays;

import java.util.*;

public class WeeklyCalendar {

    private List<WeeklyEntry> entries;

    public WeeklyCalendar() {
        this.entries = new ArrayList<>();
    }

    public void addEntry(String weekday, String notes) {
        this.entries.add(new WeeklyEntry(weekday, notes));
    }

    public Iterable<WeeklyEntry> getWeeklySchedule(){
        Collections.sort(this.entries, WeeklyEntry.WEEKLY_ENTRY_COMPARATOR_BY_DAY_ASC);
        //this.entries.sort(WeeklyEntry.WEEKLY_ENTRY_COMPARATOR_BY_DAY_ASC);
        return this.entries;
    }
}
