package bridge;

public class MainTrain {

    public static void main(String[] args) {
        Task t = new Task1();
        t.doTask(new DBLogger());
        t.doTask(new FileLogger());
    }
}
