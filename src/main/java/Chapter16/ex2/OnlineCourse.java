package Chapter16.ex2;

public class OnlineCourse extends Course {

    private int videoLength;
    private int timeToFinish;

    public OnlineCourse(String id, double price, String title, String description, int videoLength, int timeToFinish) {
        super(id, price, title, description);
        this.videoLength = videoLength;
        this.timeToFinish = timeToFinish;
    }

    public int getVideoLength() {
        return videoLength;
    }

    public void setVideoLength(int videoLength) {
        this.videoLength = videoLength;
    }

    public int getTimeToFinish() {
        return timeToFinish;
    }

    public void setTimeToFinish(int timeToFinish) {
        this.timeToFinish = timeToFinish;
    }
}
