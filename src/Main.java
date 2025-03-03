public class Main {
    public static void main(String[] args) {
        String filePath = "data/sample.txt"; // File to encrypt/decrypt
        String action = "encrypt"; // or "decrypt"

        ProcessManager processManager = new ProcessManager();
        FileEncryptor encryptor = new FileEncryptor(processManager);

        encryptor.handleFile(filePath, action);
    }
}
