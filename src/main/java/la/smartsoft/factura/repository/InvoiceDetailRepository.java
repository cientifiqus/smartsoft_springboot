package la.smartsoft.factura.repository;

import la.smartsoft.factura.entity.InvoiceDetailModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface InvoiceDetailRepository extends CrudRepository<InvoiceDetailModel, Long> {
    public abstract ArrayList<InvoiceDetailModel> findByInvoiceId(Long invoiceId);
}
