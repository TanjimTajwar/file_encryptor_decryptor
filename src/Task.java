public class Task {
    private final String filePath;
    private String data;
    private final String action;

    public Task(String filePath, String data, String action) {
        this.filePath = filePath;
        this.data = data;
        this.action = action;
    }

    public String getFilePath() { return filePath; }
    public String getData() { return data; }
    public void setData(String data) { this.data = data; }
    public String getAction() { return action; }
}
