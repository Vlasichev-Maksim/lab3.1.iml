import java.util.Scanner;
public abstract class Dish {
    private String Material;
    private float price;
    private String name;
    public String getMaterial(){return Material;}
    public String getName(){return name;}
    public float getPrice(){return price;}
    public Dish(String material, String name, float price){
        this.Material = material;
        this.name = name;
        this.price = price;
    }
    public abstract void displayInfo();
}
class tish extends Dish {
    private float radius;

    public tish(String material, String name, float price, float R) {
        super(material, name, price);
        this.radius = R;
    }

    public void displayInfo() {
        System.out.println("Тип товара: " + getName() + "\nМатериал товара: " + getMaterial() + "\nЦена товара: " + getPrice() + "\nРадиус: " + radius);
    }
}
class cup extends  Dish{
    private double V;
    private float R;
    private float H;
    public cup(String material, String name, float price, float r, float h) {
        super(material, name, price);
        this.R = r;
        this.H = h;
    }
    public double V() {
        this.V = 3.14*(R*R)*H;
        return this.V;
    }
    public void displayInfo() {
        System.out.println("Тип товара: " + getName() + "\nМатериал товара: " + getMaterial() + "\nЦена товара: " + getPrice() + "\nОбъём: " + V);
    }
}
class scoop extends  Dish{
    private int count;
    public scoop(String material, String name, float price, int count) {
        super(material, name, price);
        this.count = count;
    }
    public int getCount(){return count;}
    public void displayInfo() {
        System.out.println("Тип товара: " + getName() + "\nМатериал товара: " + getMaterial() + "\nЦена товара: " + getPrice() + "\nКоличество: " + getCount());
    }

}
class knife extends  Dish {
    private float length;

    public knife(String material, String name, float price, float length) {
        super(material, name, price);
        this.length = length;
    }

    public float getLength() {
        return length;
    }

    public void displayInfo() {
        System.out.println("Тип товара: " + getName() + "\nМатериал товара: " + getMaterial() + "\nЦена товара: " + getPrice() + "\nДлинна: " + getLength());
    }
}
class Main {
    public static void main(String[] args) {
        tish first = new tish("Стекло", "Тарелка", 20, 10);
        first.displayInfo();
        System.out.println("--------------------------------------------------------");
        cup second = new cup("Керамика", "Чашка", 30, 5, 10);
        second.displayInfo();
        System.out.println("--------------------------------------------------------");
        knife third = new knife("Сталь", "Нож", 40, 15);
        third.displayInfo();
        System.out.println("--------------------------------------------------------");
        scoop firth = new scoop("Серебро", "Ложка", 15, 5);
        firth.displayInfo();
    }
}