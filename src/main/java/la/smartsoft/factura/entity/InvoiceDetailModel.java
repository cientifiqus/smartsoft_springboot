package la.smartsoft.factura.entity;

import la.smartsoft.factura.entity.jpa.InvoiceDetailPK;

import javax.persistence.*;

@Entity
@IdClass(InvoiceDetailPK.class)
@Table(name = "invoice_detail")
public class InvoiceDetailModel {

    @EmbeddedId
    private Long detail_id;
    private Long invoice_id;

    @Column(name = "invoice_id", insertable = false, updatable = false)
    private Long invoiceId;

    private Long product_id;

    private Integer quantity;

    private Integer price;

    @ManyToOne
    @JoinColumn(name = "invoice_id", insertable = false, updatable = false)
    private InvoiceModel invoice;

    @ManyToOne
    @JoinColumn(name = "product_id", insertable = false, updatable = false)
    private ProductModel product;

    public Long getDetail_id() {
        return detail_id;
    }

    public void setDetail_id(Long detail_id) {
        this.detail_id = detail_id;
    }

    public Long getInvoice_id() {
        return invoice_id;
    }

    public void setInvoice_id(Long invoice_id) {
        this.invoice_id = invoice_id;
    }

    public Long getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(Long invoiceId) {
        this.invoiceId = invoiceId;
    }

    public Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
