package com.company.Lab2.Decorator;

/**
 * https://refactoring.guru/ru/design-patterns/decorator/java/example
 * Пример показывает, как можно добавить новую функциональность объекту, не меняя его класса.
 *
 * Сначала класс бизнес-логики мог считывать и записывать только чистые данные напрямую из/в файлы.
 * Применив паттерн Декоратор, мы создали небольшие классы-обёртки, которые добавляют новые поведения до или после
 * основной работы вложенного объекта бизнес-логики.
 *
 * Первая обёртка шифрует и расшифрует данные, а вторая — сжимает и распакует их.
 *
 * Мы можем использовать обёртки как отдельно друг от друга, так и все вместе, обернув один декоратор другим.
 *
 *
 *  DataSource.java: Интерфейс, задающий базовые операции чтения и записи данных
 *  FileDataSource.java: Класс, реализующий прямое чтение и запись данных
 *  DataSourceDecorator.java: Базовый декоратор
 *  EncryptionDecorator.java: Декоратор шифрования
 *  CompressionDecorator.java: Декоратор сжатия
  */



public class Demo {
    public static void main(String[] args) {

        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";

        DataSourceDecorator compressedAndEncrypted = new EncryptionDecorator(
                new CompressionDecorator(
                        new FileDataSource("D:/TMPS/singleton/src/com/company/Lab2/Decorator/OutputDemo.txt")));
        compressedAndEncrypted.writeData(salaryRecords);

        DataSource plain = new FileDataSource("D:/TMPS/singleton/src/com/company/Lab2/Decorator/OutputDemo.txt");

        System.out.println("- Input -----------------------------------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded = Compressed + Encrypted --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded ---------------------------------------");
        System.out.println(compressedAndEncrypted.readData());

        DataSourceDecorator encrypted = new EncryptionDecorator(
                new FileDataSource("D:/TMPS/singleton/src/com/company/Lab2/Decorator/OutputDemo.txt"));
        encrypted.writeData(salaryRecords);

        plain = new FileDataSource("D:/TMPS/singleton/src/com/company/Lab2/Decorator/OutputDemo.txt");

        System.out.println("- Encoded = Encrypted ---------------------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded ---------------------------------------");
        System.out.println(encrypted.readData());

        DataSourceDecorator compressed = new CompressionDecorator(
                new FileDataSource("D:/TMPS/singleton/src/com/company/Lab2/Decorator/OutputDemo.txt"));
        compressed.writeData(salaryRecords);

        plain = new FileDataSource("D:/TMPS/singleton/src/com/company/Lab2/Decorator/OutputDemo.txt");

        System.out.println("- Encoded = Compressed --------------------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded ---------------------------------------");
        System.out.println(compressed.readData());
    }
}
