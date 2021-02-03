package belajar.java.oop.data;

public class Product {
    String name;
    int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void buyProduct() {
        System.out.println("Membeli produk " + name + " dengan harga Rp." + price);
    }
}
