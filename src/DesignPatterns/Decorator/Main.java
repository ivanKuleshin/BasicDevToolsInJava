package DesignPatterns.Decorator;

public class Main {
    public static void main(String[] args) {
        String data = "It's my test data!";
        String fileName = "my test file";

        DataSource dataSource = new FileDataSourceDecorator(new FileDataSource(fileName));
        System.out.println("Original data is: " + dataSource.readData());
        dataSource.writeData(data);
        System.out.println("Original data is: " + dataSource.readData());
        System.out.println("-----------------------------------");

        dataSource = new EncryptionDecorator(new FileDataSource(fileName));
        System.out.println("Data with encryption is: " + dataSource.readData());
        dataSource.writeData(data);
        System.out.println("Data with encryption is: " + dataSource.readData());
        System.out.println("-----------------------------------");

        dataSource = new CompressionDecorator(new FileDataSource(fileName));
        System.out.println("Data with compression is: " + dataSource.readData());
        dataSource.writeData(data);
        System.out.println("Data with compression is: " + dataSource.readData());
        System.out.println("-----------------------------------");

        dataSource = new CompressionDecorator(
                        new EncryptionDecorator(
                            new FileDataSource(fileName)));
        /*
          write value fow : compress value -> encrypt value
          read value flow : decrypt value -> decompress value
         */
        System.out.println("Data with compression and encryption is: " + dataSource.readData());
        dataSource.writeData(data);
        System.out.println("Data with compression and encryption is: " + dataSource.readData());

    }
}
