package Model;

// Базовый класс для описания товара
public abstract class Tovar {
    // Переменные базового класс Товар
    protected int price; // цена
    protected String name; // название

    public abstract void printInfo();   // метод, которы выводит в консоль информацию о товаре
                                        // метод абстрактный, т.е. в базовом классе он объявлен, но его код будет описан
                                        // только в классе-наследнике

    // конструктор класса
    public Tovar(int price, String name){
        this.price = price;
        this.name = name;
    }

    // геттеры класса
    public int getPrice(){
        return price;
    }

    public String getName(){
        return name;
    }
}
