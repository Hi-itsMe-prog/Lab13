public class Main {
    public static void main(String[] args) {
        User admin = new Admin("admin123", "adminPass");
        admin.printLog();
        admin.printPass();

        User customer = new Customer("customer123", "customerPass");
        customer.printLog();
        customer.printPass();

        User guest = new Guest("guest123", "guestPass" );
        guest.printLog();
        guest.printPass();

        Product book = new Book("Java Programming", 29.99, 4.5);
        book.printName();
        book.printPrice();
        book.printRating();

        Product laptop = new Laptop("Laptop XYZ", 999.99, 4.8);
        laptop.printName();
        laptop.printPrice();
        laptop.printRating();

        Product camera = new Camera("Canon EOS", 499.99, 4.7);
        camera.printName();
        camera.printPrice();
        camera.printRating();

        UserProduct userProduct = new UserProduct();
        userProduct.UserProduct("Smartphone", "499.99", "4.7", "user123", "password123");
        userProduct.printName();
        userProduct.printPrice();
        userProduct.printRating();
        userProduct.printLog();
        userProduct.printPass();
        userProduct.purchase();
    }
}
  interface Product {
    void printName();
    void printPrice();
    void printRating();
}
interface User {
    void printPass();
    void printLog();
}

 class Admin implements User {
    public String log;
    public String pass;
    public Admin(String log, String pass) {
        this.log = log;
        this.pass = pass;
    }

    @Override
     public void printPass()
    {
        System.out.println("The admin's password is: " + pass);
    }
    @Override
     public void printLog()
    {
        System.out.println("The admin's log is: " + log);
    }

}

class Customer implements User {
    public String log;
    public String pass;

   public Customer(String log, String pass)
    {
        this.log = log;
        this.pass = pass;
    }
    @Override
    public void printPass()
    {
        System.out.println("The customer's password is: " + pass);
    }
    @Override
    public void printLog()
    {
        System.out.println("The customer's log is: " + log);
    }

}

class Guest implements User {
    public String log;
    public String pass;

    public Guest(String log, String pass)
    {
        this.log = log;
        this.pass = pass;
    }
    @Override
    public void printPass()
    {
        System.out.println("The guest's password is: " + pass);
    }
    @Override
    public void printLog()
    {
        System.out.println("The guest's log is: " + log);
    }

}

class Book implements Product {
    public String name;
    public double price;
    public double rating;

    public Book(String name, double price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    @Override
    public void printName() {
        System.out.println("Book's name is: " + name);
    }
    @Override
    public void printPrice() {
        System.out.println("Book's price is: " + price);
    }
    @Override
    public void printRating() {
        System.out.println("Book's rating is: " + rating);

    }
}


class Laptop implements Product {
    public String name;
    public double price;
    public double rating;

    public Laptop(String name, double price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    @Override
    public void printName() {
        System.out.println("Laptop's name is: " + name);
    }
    @Override
    public void printPrice() {
        System.out.println("Laptop's price is: " + price);
    }
    @Override
    public void printRating() {
        System.out.println("Laptop's rating is: " + rating);

    }
}

class Camera implements Product {
    public String name;
    public double price;
    public double rating;

    public Camera(String name, double price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    @Override
    public void printName() {
        System.out.println("Camera's brand is: " + name);
    }
    @Override
    public void printPrice() {
        System.out.println("Camera's price is: " + price);
    }
    @Override
    public void printRating() {
        System.out.println("Camera's rating is: " + rating);

    }
}
class UserProduct implements Product, User {
    public String name;
    public String price;
    public String rating;
    public String log;
    public String pass;
    void UserProduct(String name, String price, String rating, String log, String pass)
    {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.log = log;
        this.pass = pass;

    }
    @Override
    public void printName() {
        System.out.println("Product name is: " + name);
    }

    @Override
    public void printPrice() {
        System.out.println("Product price is: " + price);
    }

    @Override
    public void printRating() {
        System.out.println("Product rating is: " + rating);
    }

    @Override
    public void printPass() {
        System.out.println("User's password is: " + pass);
    }

    @Override
    public void printLog() {
        System.out.println("User's login is: " + log);
    }

    public void purchase() {
        System.out.println("Пользователь " + log + " купил товар " + name);
    }
}