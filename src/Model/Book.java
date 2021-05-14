package Model;

// Класс-наследник, для описания товара "Книга"
public class Book extends Tovar {
    // Переменные класса наследника Товар
    protected int str; // количество страниц
    protected String autor; // автор
    protected String publ; // издание

    // Конструктор
    public Book(int price, String name, int str, String autor, String publ) {
        // Обязательно вызываем конструктор базового клсса
        super(price, name);
        // Затем выполняем остальные, необходимые для инициализации класса действия
        this.str = str;
        this.autor = autor;
        this.publ = publ;
    }

    // "Перекрываем" метод базового класса (обязательно, т.к. он в базовом классе описан, как абстракнтый).
    // Метод выводит в консоль инфомрацию о товаре
    @Override
    public void printInfo() {
        System.out.println("Книга: " + name+ "," +autor + "," +publ+ "," +price);
    }

    // геттеры класса
    public int getStr(){
        return str;
    }

    public String getAutor(){
        return autor;
    }

    public String getPubl(){
        return publ;
    }
}
