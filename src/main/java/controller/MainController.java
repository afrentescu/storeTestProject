package controller;

import jakarta.validation.Valid;
import model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.MainService;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/products")
public class MainController {

    @Autowired
    private MainService mainService;

    @GetMapping("/allProducts")
    public List<Product> getAllProducts(){
        return mainService.getAllProducts();
    }

    @GetMapping("/productById")
    public Product getProductById(@RequestParam int id) {
        return mainService.getProductById(id);
    }

    @GetMapping("/productsByCategory")
    public List<Product> getProductsByCategory(@RequestParam int id){
        return mainService.getProductsByCategory(id);
    }

    @PostMapping("/addProduct")
    public ResponseEntity<Product> addProduct(@RequestBody @Valid Product product){
        return ResponseEntity.ok().body(mainService.addProduct(product));
    }

    @DeleteMapping("/deleteProduct")
    public List<Product> deleteProduct(@RequestParam  int id){
        return mainService.deleteProduct(id);
    }


}
