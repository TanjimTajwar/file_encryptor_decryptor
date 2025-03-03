public class Worker implements Runnable {
    private final Task task;

    public Worker(Task task) {
        this.task = task;
    }

    @Override
    public void run() {
        System.out.println("Processing file: " + task.getFilePath());

        if ("encrypt".equalsIgnoreCase(task.getAction())) {
            // Perform encryption (dummy logic for now)
            task.setData("Encrypted: " + task.getData());
        } else {
            // Perform decryption (dummy logic for now)
            task.setData("Decrypted: " + task.getData());
        }

        new IOHandler().writeFile(task.getFilePath(), task.getData());
    }
}
