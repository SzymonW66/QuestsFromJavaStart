package Chapter21.ex4;

public class Loader {
    private static final double PROGRESS_STEP = 0.5;
    private static final double PROGRESS_MAX_VALUE = 100;
    private static final int PROGRESS_BAR_LENGTH = 10;
    private static final String PROGRESS_BAR_SYMBOL = "#";
    private static final long PAUSE_TIME_MILLIS = 200;
    private static final String PRINT_FORMAT = "Wczytywanie %c %5.2f%% (%-" + PROGRESS_BAR_LENGTH + "s)\r";

    public static void main(String[] args) {
        double progress = 0.0;
        for (int i = 0; i <= PROGRESS_MAX_VALUE; i++){
            String progressBar = getProgressBar(progress);
            char progressIndicator = i % 2 == 0 ? '/' : '\\';
            System.out.printf(PRINT_FORMAT, progressIndicator, progress, progressBar);
            progress = PROGRESS_STEP * i;
            pause();
        }
    }

    private static void pause() {
        try {
            Thread.sleep(PAUSE_TIME_MILLIS);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

    }

    private static String getProgressBar(double progress) {
        double progressBarStep = (int)(PROGRESS_MAX_VALUE / PROGRESS_BAR_LENGTH);
        int numberOfDots = (int) (progress/ progressBarStep);
        return  PROGRESS_BAR_SYMBOL.repeat(numberOfDots);
    }
}
