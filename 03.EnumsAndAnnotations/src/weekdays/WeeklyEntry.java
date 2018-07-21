package weekdays;

import java.util.Comparator;

public class WeeklyEntry {
    public final static Comparator<WeeklyEntry> BY_WEEKDAY = getCompByDay();

    private Weekday weekday;
    private String notes;

    public WeeklyEntry(String weekday, String notes) {
        this.weekday = Enum.valueOf(Weekday.class, weekday.toUpperCase());
        this.notes = notes;
    }

    public Weekday getWeekday() {
        return this.weekday;
    }

    public String getNotes() {
        return this.notes;
    }

    @Override
    public String toString() {
        return String.format("%s - %s", this.getWeekday(), this.getNotes());
    }

    private static Comparator<WeeklyEntry> getCompByDay() {
        return (e1, e2) -> e1.weekday.compareTo(e2.weekday);
    }
}
