package com.gb.lessons;

public class MyArrayDataException extends RuntimeException{
    public MyArrayDataException(int x, int y) {
        super("В ячейке " + x + "x" + y + ", невозможно выполнить преобразование в число");
    }
}
