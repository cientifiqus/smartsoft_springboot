package la.smartsoft.factura.service;

import la.smartsoft.factura.entity.ProductModel;
import la.smartsoft.factura.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public ArrayList<ProductModel> getProducts() {
        return (ArrayList<ProductModel>) productRepository.findAll();
    }
    public ProductModel addProduct(ProductModel product) {
        return productRepository.save(product);
    }
}
