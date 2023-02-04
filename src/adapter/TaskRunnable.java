package adapter;

/**
 * This design pattern is called Object Adapter.
 * This is because it contains the object we would like to change.
 * And implements the interface we would like to change into, for example here:
 * Making any object of type Task into Runnable.
 */
public class TaskRunnable implements Runnable {

    Task task;

    public TaskRunnable(Task t){
        task = t;
    }

    @Override
    public void run() {
        task.doTask();
    }
}
