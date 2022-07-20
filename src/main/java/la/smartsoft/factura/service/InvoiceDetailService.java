package la.smartsoft.factura.service;

import la.smartsoft.factura.entity.InvoiceDetailModel;
import la.smartsoft.factura.repository.InvoiceDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class InvoiceDetailService {
    @Autowired
    InvoiceDetailRepository invoiceDetailRepository;

    public InvoiceDetailModel addInvoiceDetail(InvoiceDetailModel invoiceDetail) {
        return invoiceDetailRepository.save(invoiceDetail);
    }
    public ArrayList<InvoiceDetailModel> findByInvoiceId(Long invoiceId) {
        return invoiceDetailRepository.findByInvoiceId(invoiceId);
    }
}
