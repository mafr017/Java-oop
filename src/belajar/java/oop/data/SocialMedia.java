package belajar.java.oop.data;

class SocialMedia {
    String name;
}

final class Facebook extends SocialMedia {
    final void login(String username, String password) {
    }
}

// error tidak bisa karena parent facebook bersifat final
//class FakeFacebook extends Facebook {
//    void login(String username, String password) {
//    }
//}