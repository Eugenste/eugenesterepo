package ua.training.watchesFactory;

public class WatchMain {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.initWatchFactories();
        Watch watch = controller.createWatch("Casio").getWatch();
        watch.showTime();
    }
}
