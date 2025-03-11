public class Main {
    public static void main(String[] args) {
        Admin admin = new Admin();
        admin.Admin("admin123", "adminPass");
        admin.printLog(admin.log);
        admin.printPass(admin.pass);

        Customer customer = new Customer();
        customer.Customer("customer123", "customerPass");
        customer.printLog(customer.log);
        customer.printPass(customer.pass);

        Guest guest = new Guest();
        guest.Guest("guest123", "guestPass");
        guest.printLog(guest.log);
        guest.printPass(guest.pass);

        Book book = new Book("Java Programming", 29.99, 4.5);
        book.printName(book.name);
        book.printPrice(String.valueOf(book.price));
        book.printRating(String.valueOf(book.rating));

        Laptop laptop = new Laptop("Laptop XYZ", 999.99, 4.8);
        laptop.printName(laptop.name);
        laptop.printPrice(String.valueOf(laptop.price));
        laptop.printRating(String.valueOf(laptop.rating));

        Camera camera = new Camera("Canon EOS", 499.99, 4.7);
        camera.printName(camera.name);
        camera.printPrice(String.valueOf(camera.price));
        camera.printRating(String.valueOf(camera.rating));

        UserProduct userProduct = new UserProduct();
        userProduct.UserProduct("Smartphone", "499.99", "4.7", "user123", "password123");
        userProduct.printName(userProduct.name);
        userProduct.printPrice(userProduct.price);
        userProduct.printRating(userProduct.rating);
        userProduct.printLog(userProduct.log);
        userProduct.printPass(userProduct.pass);
        userProduct.purchase();
    }
}
  interface Product {
    void printName(String name);
    void printPrice(String price);
    void printRating(String rating);
}
interface User {
    void printPass(String pass);
    void printLog(String log);
}

 class Admin implements User {
    public String log;
    public String pass;
    void Admin(String log, String pass)
    {
        this.log = log;
        this.pass = pass;
    }
    @Override
     public void printPass(String pass)
    {
        System.out.println("The admin's password is: " + pass);
    }
    @Override
     public void printLog(String log)
    {
        System.out.println("The admin's log is: " + log);
    }

}

class Customer implements User {
    public String log;
    public String pass;
    void Customer(String log, String pass)
    {
        this.log = log;
        this.pass = pass;
    }
    @Override
    public void printPass(String pass)
    {
        System.out.println("The customer's password is: " + pass);
    }
    @Override
    public void printLog(String log)
    {
        System.out.println("The customer's log is: " + log);
    }

}

class Guest implements User {
    public String log;
    public String pass;
    void Guest(String log, String pass)
    {
        this.log = log;
        this.pass = pass;
    }
    @Override
    public void printPass(String pass)
    {
        System.out.println("The guest's password is: " + pass);
    }
    @Override
    public void printLog(String log)
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
    public void printName(String name) {
        System.out.println("Book's name is: " + name);
    }
    @Override
    public void printPrice(String price) {
        System.out.println("Book's price is: " + price);
    }
    @Override
    public void printRating(String rating) {
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
    public void printName(String name) {
        System.out.println("Laptop's name is: " + name);
    }
    @Override
    public void printPrice(String price) {
        System.out.println("Laptop's price is: " + price);
    }
    @Override
    public void printRating(String rating) {
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
    public void printName(String name) {
        System.out.println("Camera's brand is: " + name);
    }
    @Override
    public void printPrice(String price) {
        System.out.println("Camera's price is: " + price);
    }
    @Override
    public void printRating(String rating) {
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
    public void printName(String name) {
        System.out.println("Product name is: " + name);
    }

    @Override
    public void printPrice(String price) {
        System.out.println("Product price is: " + price);
    }

    @Override
    public void printRating(String rating) {
        System.out.println("Product rating is: " + rating);
    }

    @Override
    public void printPass(String pass) {
        System.out.println("User's password is: " + pass);
    }

    @Override
    public void printLog(String log) {
        System.out.println("User's login is: " + log);
    }

    public void purchase() {
        System.out.println("Пользователь " + log + " купил товар " + name);
    }
}