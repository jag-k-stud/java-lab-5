package Model;

import java.util.ArrayList;

// Класс для управления товарами. Позволяет работать с товарами (дисками и книгами):
// добавлять, удалять, извлекать, выводить список товаров в консоль и т.д.
public class Manager {
    // Переменные класса
    private ArrayList<Tovar> massTovars = new ArrayList<Tovar>(); // Динамический список с товарами

    // Добавить новый товар. Добавляется товар "Книга"
    public void addTovar(int price, String name, int str, String autor, String publ){
        Book c = new Book(price, name, str, autor, publ);
        massTovars.add(c);
    }

    // Добавить новый товар. Добавляется товар "Диск"
    public void addTovar(int price, String name, int cap){
        Disc n = new Disc(price, name, cap);
        massTovars.add(n);
    }

    // Примечание.
    // Методы addTovar отличаются друг от друга набором входных параметров.
    // Если не получается отилчить товары по входным параметрам, тогда добавляются вва метода с разными названиями
    // и одинаковыми входными параметрами (но при этом обязательно внутри методов должны создаваться
    // экземпляры разных классов, зависящие от типа добавляемого товара)

    // Вывести в консоль все, хранящиеся в списке товары
    public void printAllTovars(){
        for(int i = 0; i<massTovars.size(); i++){
            Tovar t = massTovars.get(i);
            t.printInfo();
        }
    }

    // Удалить товар. Указывается номер (индекс товара). Проверяется, корректно ли указан индекс,
    // т.е. не указали ил номер несуществующего товара.
    public void removeTovars(int index){
        if(index>=massTovars.size()){
            System.out.println("Товара с указанным индексом не существует");
            return;
        }
        massTovars.remove(index);
    }

    // Получить товар. Метод возвращает ссылку на класс базового типа.
    public Tovar getTovar(int index){
        if(index>=massTovars.size()){
            System.out.println("Товара с указанным индексом не существует");
            return null;
        }
        Tovar j = massTovars.get(index);
        return j;
    }
}
