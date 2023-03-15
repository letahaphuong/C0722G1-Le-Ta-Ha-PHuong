package ss4_class_object.excercise.stop_watch;

public class Main {
    public static void main(String[] args) {
        StopWacth stopWacth=new StopWacth();
        stopWacth.start();
        for (long i = 0; i < 10000000000L; i++) {
            i++;
        }
        stopWacth.stop();
        System.out.printf("Time to running code: %d ms",stopWacth.getElapsedTime());
    }
}
