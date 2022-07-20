package la.smartsoft.factura.controller;

import la.smartsoft.factura.entity.ProductModel;
import la.smartsoft.factura.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping()
    public ArrayList<ProductModel> getProducts() {
        return productService.getProducts();
    }

    @PostMapping()
    public ProductModel addProduct(@RequestBody ProductModel product) {
        return this.productService.addProduct(product);
    }
}
