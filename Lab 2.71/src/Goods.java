import java.io.BufferedReader;
import java.io.IOException;
/**
<h1>Class Goods</h1>
 Класс, представляющий товар.
 */
public class Goods {

    // поля класса Goods
    private String name;   // имя товара
    private String info;   // информация о товаре
    private int price;     // цена товара
    private int value;     // значение товара
    private int number;    // количество товара

    // конструктор по умолчанию

    /**

     Конструктор класса Goods без параметров
     Устанавливает значения полей по умолчанию:
     name = "None", info = "None", price = 0, value = 0, number = 0
     */

    public Goods() {
        name = "None";
        info = "None";
        price = 0;
        value = 0;
        number = 0;
    }

    // конструктор копирования
    /**

     Конструктор класса Goods, создающий новый объект путем копирования полей другого объекта.
     @param object - объект класса Goods, поля которого будут скопированы в новый объект
     */
    public Goods(Goods object) {
        name = object.name;
        info = object.info;
        price = object.price;
        value = object.value;
        number = object.number;
    }

    // метод копирования объекта
    /**

     Создает и возвращает новый объект Goods, который является копией данного объекта
     @return новый объект Goods
     */
    public Goods clone() {
        return new Goods(this);
    }

    // метод сравнения объектов
    /**

     Метод проверяет, равен ли объект текущему объекту
     @param object объект класса Goods, с которым производится сравнение
     @return true, если объекты равны, false - в противном случае
     */
    public boolean equal(Goods object) {
        return (name.equals(object.name) &&
                info.equals(object.info) &&
                price == object.price &&
                value == object.value &&
                number == object.number);
    }

    // метод чтения информации о товаре из файла
    /**

     Читает строку из заданного буферизированного потока и заполняет поля объекта Goods.

     @param reader буферизированный поток ввода данных

     @throws IOException если произошла ошибка ввода-вывода в процессе чтения из потока
     */
    public void readingFile(BufferedReader reader) throws IOException {
        String line = reader.readLine();
        String[] fields = line.split(",");

        name = fields[0];
        info = fields[1];
        price = Integer.parseInt(fields[2]);
        value = Integer.parseInt(fields[3]);
        number = Integer.parseInt(fields[4]);
    }

    // метод вывода информации о товаре
    /**

     Выводит информацию об объекте в консоль.
     Формат вывода: "name, info, price, value, number".
     */
    public void writeElement(){
        System.out.println(
                name +","+
                        info + ","+
                        price + ","+
                        value + ","+
                        number);
    }
}