package adapter;

public class MainTrain {
    public static void main(String[] args) {
        Thread thread = new Thread(new TaskRunnable(new CodeExecuterTask()));
        thread.start();
    }
}
