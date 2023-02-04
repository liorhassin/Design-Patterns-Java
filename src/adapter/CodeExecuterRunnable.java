package adapter;

/**
 * This design pattern is called Class Adapter.
 * This is because it extends the class that contains the methods we would like to access.
 * And implements the interface we would like to change into, for example here:
 * Making the class CodeExecuterTask into Runnable and gaining access to all CodeExecuterTask methods.
 */
public class CodeExecuterRunnable extends CodeExecuterTask implements Runnable{

    @Override
    public void run() {
        preCompile();
        compile();
        execute();
    }
}
