package academic;

import enums.LessonType;
import java.time.DayOfWeek;
import java.util.Objects;

public class Lesson {
    private Course course;
    private LessonType type;
    private DayOfWeek day;
    private int begin;
    private int duration;
    private int room;

    public Lesson() {
        this.begin = -1;
        this.day = null;
    }

    public Lesson(Course course, LessonType type, int duration) {
        this.course = course;
        this.type = type;
        this.duration = duration;
        this.room = 0;
    }

    public LessonType getType() {
        return type;
    }

    public void setType(LessonType type) {
        this.type = type;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public DayOfWeek getDay() {
        return day;
    }

    public void setDay(DayOfWeek day) {
        this.day = day;
    }

    public int getBegin() {
        return begin;
    }

    public void setBegin(int begin) {
        this.begin = begin;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Lesson other = (Lesson) obj;
        return Objects.equals(course, other.course) &&
               Objects.equals(type, other.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(begin, course, day, duration, room, type);
    }

    @Override
    public Lesson clone() throws CloneNotSupportedException {
        Lesson clone = (Lesson) super.clone();
        clone.setCourse(course);
        return clone;
    }

    public String getDescription() {
        return this.course.getName() + ": " + this.type + ", " + this.day + ", " + this.begin + 
               "-" + (this.begin + this.duration);
    }

    @Override
    public String toString() {
        return this.course.getName() + ": " + this.type + ", " + this.begin + 
               "-" + (this.begin + this.duration);
    }

    public int compareTo(Lesson lesson) {
        return Integer.compare(this.getBegin(), lesson.getBegin());
    }
}