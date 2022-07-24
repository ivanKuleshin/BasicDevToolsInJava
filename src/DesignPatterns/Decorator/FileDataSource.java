package DesignPatterns.Decorator;

public class FileDataSource implements DataSource {
    private final String fileName;
    private String data = "empty";

    public FileDataSource(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void writeData(String data) {
//        System.out.printf("Write original data to \"%s\"\n", fileName);
        this.data = data;
    }

    @Override
    public String readData() {
//        System.out.printf("Read original data from \"%s\"\n", fileName);
        return data;
    }
}
