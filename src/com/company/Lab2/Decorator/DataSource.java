package com.company.Lab2.Decorator;

// Интерфейс, задающий базовые операции чтения и записи данных

public interface DataSource {
    void writeData(String data);

    String readData();
}
