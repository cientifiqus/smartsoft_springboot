package la.smartsoft.factura.entity.jpa;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.*;

@Embeddable
public class InvoiceDetailPK implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long detail_id;
    private Long invoice_id;

    // default constructor
//
//    public InvoiceDetailPK(Long detail_id, Long invoice_id) {
//        this.detail_id = detail_id;
//        this.invoice_id = invoice_id;
//    }
//
//    public InvoiceDetailPK(){
//    }

    // equals() and hashCode()
}