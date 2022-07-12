package FunctionnalProgramming;

import java.util.ArrayList;

import static javax.swing.text.html.HTML.Tag.P;

class Product{
    int id;
    String name;
    double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}



public class StreamFilterDemo2 {
    public static void main(String[] args) {

        ArrayList <Product>al = new ArrayList<Product>();
        al.add(new Product(1,"HP Laptop",25000));
        al.add(new Product(2,"Dell",30000));
        al.add(new Product(3,"Lenovo",28000));
        al.add(new Product(4,"Sony",23000));
        al.add(new Product(5,"Apple",90000));

        al.stream().filter(n->n.price>25000).forEach(n-> System.out.println(n.name));

        al.stream().filter(n->n.price>25000).forEach(n-> System.out.println(n.price));

        al.stream().filter(n->n.price>25000).forEach(n-> System.out.println(n.id));

       // al.stream().filter(n->n.price>25000).forEach(n-> System.out.println(n)); it doesn't work for the entire object, all 3 data points

    }
}
