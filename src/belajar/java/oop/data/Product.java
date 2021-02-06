package belajar.java.oop.data;

public class Product {
    public String name;
    public int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void buyProduct() {
        System.out.println("Membeli produk " + name + " dengan harga Rp." + price);
    }

    @Override
    public String toString() {
        return "Product name=" + name + ", price=" + price;
//        return "Product{" +
//                "name='" + name + '\'' +
//                ", price=" + price +
//                '}';
    }
}
