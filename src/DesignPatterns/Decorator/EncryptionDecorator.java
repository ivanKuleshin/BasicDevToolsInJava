package DesignPatterns.Decorator;

public class EncryptionDecorator extends FileDataSourceDecorator {
    public EncryptionDecorator(DataSource fileDataSource) {
        super(fileDataSource);
    }

    @Override
    public void writeData(String data) {
        super.writeData(encryptData(data));
    }

    @Override
    public String readData() {
        return decryptData(super.readData());
    }

    private String encryptData(String data) {
        return "Encrypted: " + data;
    }

    private String decryptData(String data) {
        return "Decrypted: " + data;
    }
}
