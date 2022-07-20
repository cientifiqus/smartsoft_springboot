package la.smartsoft.factura.repository;

import la.smartsoft.factura.entity.ProductModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<ProductModel, Long> {

}
