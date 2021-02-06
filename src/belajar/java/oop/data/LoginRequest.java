package belajar.java.oop.data;

public record LoginRequest(String username, String password) {

    //compact constructor
    public LoginRequest {
        System.out.println("Membuat Object LoginRequest");
    }

    //constructor overloading tetap harus memanggil constructor utama
    public LoginRequest(String username) {
        this(username, "");
    }

    public LoginRequest() {
        this("", "");
    }

    //menambahkan method
    public void sayHello(String name) {
        System.out.println("Hello " + name + ", My name is" + this.username);
    }

}
