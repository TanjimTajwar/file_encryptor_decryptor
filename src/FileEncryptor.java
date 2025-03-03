
public class FileEncryptor {
    private final IOHandler ioHandler;
    private final ProcessManager processManager;

    public FileEncryptor(ProcessManager processManager) {
        this.ioHandler = new IOHandler();
        this.processManager = processManager;
    }

    public void handleFile(String filePath, String action) {
        String data = ioHandler.readFile(filePath);
        Task task = new Task(filePath, data, action);
        processManager.submitTask(task);
    }
}
