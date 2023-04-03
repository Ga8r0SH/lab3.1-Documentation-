import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
 <h1>Class Main</h1>
 Этот Java код читает данные из файла "document.txt", создает объекты класса Goods и заполняет
 их данными из файла. Затем он выводит содержимое каждого созданного объекта на экран.
 ------------------------------------------------<br>
 Создается массив объектов типа Goods с размером 50.
 Создается объект FileReader, который открывает файл для чтения. Путь к файлу указывается в строке
 "C:\Users\gavro\Desktop\lab1struct\lab1\src\document.txt".
 Создается объект BufferedReader, который позволяет читать данные из файла.
 В цикле for проходятся все элементы массива tovar. Для каждого элемента создается новый объект типа Goods,
 а затем метод readingFile() этого объекта вызывается с параметром buffer. Метод readingFile() читает данные
 из файла, используя объект buffer, и заполняет поля объекта Goods.
 Во втором цикле for проходятся все элементы массива tovar. Для каждого элемента вызывается метод writeElement(),
 который выводит содержимое объекта на экран.
 Если возникает исключение IOException при чтении файла, программа выводит сообщение об ошибке на экран.*/

public class Main {
    public static void main(String[] args) {
        Goods[] tovar = new Goods[50];

        try{
            FileReader file = new FileReader("C:\\Users\\gavro\\Desktop\\lab1struct\\lab1\\src\\document.txt");
            BufferedReader buffer = new BufferedReader(file);
            for(int i = 0 ; i < tovar.length; i++ ){
                tovar[i] = new Goods();
                tovar[i].readingFile(buffer);
            }
            for(int i = 0; i<tovar.length;i++){
                tovar[i].writeElement();
            }
        }
        catch (IOException e){
            System.out.println("Error:" + e.getMessage());
        }
    }
}