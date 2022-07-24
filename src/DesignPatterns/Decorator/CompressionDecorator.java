package DesignPatterns.Decorator;

public class CompressionDecorator extends FileDataSourceDecorator {
    public CompressionDecorator(DataSource fileDataSource) {
        super(fileDataSource);
    }

    @Override
    public void writeData(String data) {
        super.writeData(compressData(data));
    }

    @Override
    public String readData() {
        return decompressData(super.readData());
    }

    private String compressData(String data) {
        return "Compressed: " + data;
    }

    private String decompressData(String data) {
        return "Decompressed: " + data;
    }
}
