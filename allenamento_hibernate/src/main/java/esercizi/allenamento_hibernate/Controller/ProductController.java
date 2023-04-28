package esercizi.allenamento_hibernate.Controller;

import esercizi.allenamento_hibernate.Entity.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ProductController {
    ArrayList<Product> productArrayList= new ArrayList<>();

    @GetMapping("/products")
    public ArrayList<Product> getAllproducts(){

        Product product1=new Product(1,"pasta",10.00);
        productArrayList.add(product1);

        Product product2=new Product(2,"pane",5.00);
        productArrayList.add(product2);




        return productArrayList;


    }


    @GetMapping("/products/{id},{name},{price}")
    public Product Product(@PathVariable int id,@PathVariable String name,@PathVariable double price){

        if(!name.matches("[a-zA-Z]+")   || price<0  ){
        throw new IllegalArgumentException("valori non accettati");}

        Product product=new Product();
        product.setId(id);
        product.setName(name);
        product.setPrice(price);

        return product;
    }

}
