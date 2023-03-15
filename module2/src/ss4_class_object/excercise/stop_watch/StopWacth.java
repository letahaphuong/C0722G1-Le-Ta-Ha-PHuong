package ss4_class_object.excercise.stop_watch;

public class StopWacth {
    long startTime;
    long stopTime;

    public StopWacth() {//Constructor
    }

    void start() {//Khởi tạo phương thức bắt đầu
        this.startTime = System.currentTimeMillis();
    }

    void stop() {//Khởi tạo phương thức bắt đầu
        this.stopTime = System.currentTimeMillis();
    }

    long getElapsedTime() {
        return this.stopTime - this.startTime;
    }


}
