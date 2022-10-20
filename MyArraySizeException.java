package main.Lesson10.Home;

public class MyArraySizeException extends Exception{
    public MyArraySizeException() {
        super("Размер массива не корректный!");
    }
}