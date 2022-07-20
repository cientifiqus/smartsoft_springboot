package la.smartsoft.factura.repository;

import la.smartsoft.factura.entity.CustomerModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Repository
@Transactional
public interface CustomerRepository extends CrudRepository<CustomerModel, Long> {
}
