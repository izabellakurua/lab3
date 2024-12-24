package org.example;
//штучный товар
public class PieceProduct4 extends Product2
{
    private final double weight; //вес одной штуки товара

    public PieceProduct4(String name, String description, double weight)
    {
        super(name, description); // вызов конструктора родительского класса
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "PieceProduct{" +
                "weight=" + weight +
                '}';
    }
}
