package problem_5;

public class Time implements Comparable<Time> {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    public void setTime(int hour, int minute, int second) {
        if (hour < 0 || hour > 23 || minute < 0 || minute > 59 || second < 0 || second > 59) {
            throw new IllegalArgumentException("Nuh-uh, these are invalid time values");
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toUniversal() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public String toStandard() {
        int standardHour = hour % 12 == 0 ? 12 : hour % 12;
        String period = hour < 12 ? "AM" : "PM";
        return String.format("%02d:%02d:%02d %s", standardHour, minute, second, period);
    }

    public void add(Time other) {
        this.second += other.second;
        this.minute += this.second / 60;
        this.second %= 60;

        this.minute += other.minute;
        this.hour += this.minute / 60;
        this.minute %= 60;

        this.hour += other.hour;
        this.hour %= 24;
    }

    @Override
    public int compareTo(Time other) {
        int thisTotalSeconds = this.hour * 3600 + this.minute * 60 + this.second;
        int otherTotalSeconds = other.hour * 3600 + other.minute * 60 + other.second;
        return Integer.compare(thisTotalSeconds, otherTotalSeconds);
    }

    @Override
    public String toString() {
        return String.format("Time: %02d:%02d:%02d", hour, minute, second);
    }
}
