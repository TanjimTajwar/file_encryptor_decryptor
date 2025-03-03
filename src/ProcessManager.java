import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ProcessManager {
    private final ExecutorService executorService;

    public ProcessManager() {
        this.executorService = Executors.newFixedThreadPool(4); // Parallel processing
    }

    public void submitTask(Task task) {
        executorService.submit(new Worker(task));
    }
}
