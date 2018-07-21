package weekdays;

public enum Weekday {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    @Override
    public String toString() {
      char upper = super.name().charAt(0);
      String lower = super.name().substring(1).toLowerCase();
      return upper + lower;
    }
}
