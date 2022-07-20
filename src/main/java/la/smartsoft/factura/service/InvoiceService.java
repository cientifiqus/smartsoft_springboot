package la.smartsoft.factura.service;

import la.smartsoft.factura.entity.InvoiceModel;
import la.smartsoft.factura.repository.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class InvoiceService {
    @Autowired
    InvoiceRepository invoiceRepository;

    public InvoiceModel addInvoice(InvoiceModel invoice) {
        return invoiceRepository.save(invoice);
    }

    public ArrayList<InvoiceModel> findByCustomerId(Long customerId) {
        return invoiceRepository.findByCustomerId(customerId);
    }
}
