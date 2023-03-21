package Chapter16.ex2;

public class BootcampOnline extends OnlineCourse{
    private String teacher;
    private String consulatationHours;

    public BootcampOnline(String id, double price, String title, String description, int videoLength, int timeToFinish, String teacher, String consulatationHours) {
        super(id, price, title, description, videoLength, timeToFinish);
        this.teacher = teacher;
        this.consulatationHours = consulatationHours;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getConsulatationHours() {
        return consulatationHours;
    }

    public void setConsulatationHours(String consulatationHours) {
        this.consulatationHours = consulatationHours;
    }

    @Override
    public String toString() {
        return "BootcampOnline{" +
                "teacher='" + teacher + '\'' +
                ", consulatationHours='" + consulatationHours + '\'' +
                '}';
    }
}
