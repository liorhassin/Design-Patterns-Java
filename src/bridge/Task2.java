package bridge;

public class Task2 implements Task {

    @Override
    public void doTask(Logger logger) {
        logger.writeToLog("Starting the task");
        //...
        //Does something
        //...
        logger.writeToLog("Ending the task");
    }

}
