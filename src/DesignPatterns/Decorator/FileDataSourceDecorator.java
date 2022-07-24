package DesignPatterns.Decorator;

public class FileDataSourceDecorator implements DataSource {
    DataSource dataSource;

    public FileDataSourceDecorator(DataSource fileDataSource) {
        this.dataSource = fileDataSource;
    }

    @Override
    public void writeData(String data) {
        dataSource.writeData(data);
    }

    @Override
    public String readData() {
        return dataSource.readData();
    }
}
