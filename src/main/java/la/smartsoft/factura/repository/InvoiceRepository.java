package la.smartsoft.factura.repository;

import la.smartsoft.factura.entity.InvoiceModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface InvoiceRepository extends CrudRepository<InvoiceModel, Long> {
    public abstract ArrayList<InvoiceModel> findByCustomerId(Long customerId);
}
