package la.smartsoft.factura.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "invoice")
public class InvoiceModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long invoice_id;

    @Column(name="customer_id")
    private Long customerId;

    private Date date;

    @ManyToOne
    @JoinColumn(name = "customer_id", insertable = false, updatable = false)
    private CustomerModel customer;

    @OneToMany(mappedBy = "invoice")
    private Set<InvoiceDetailModel> invoice_details = new HashSet<>();


    public Long getInvoice_id() {
        return invoice_id;
    }

    public void setInvoice_id(Long invoice_id) {
        this.invoice_id = invoice_id;
    }

    public Long getCustomer_id() {
        return customerId;
    }

    public void setCustomer_id(Long customerId) {
        this.customerId = customerId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
