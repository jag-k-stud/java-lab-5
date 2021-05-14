package Model;

// Класс-наследник, для описания товара "Диск"
public class Disc extends Tovar {
    // Переменные класса-наследника Диск
    protected int cap; // объем диска

    // Конструктор
    public Disc(int price, String name, int cap) {
        // Обязательно вызываем конструктор базового клсса
        super(price, name);
        // Затем выполняем остальные, необходимые для инициализации класса действия
        this.cap = cap;
    }

    // "Перекрываем" метод базового класса (обязательно, т.к. он в базовом классе описан, как абстракнтый).
    // Метод выводит в консоль инфомрацию о товаре
    @Override
    public void printInfo() {
        System.out.println("Диск: " + name+ "," +cap+ "," +price);
    }

    public int getCap(){
        return cap;
    }
}
