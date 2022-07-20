package la.smartsoft.factura.controller;

import la.smartsoft.factura.entity.InvoiceModel;
import la.smartsoft.factura.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/invoice")
public class InvoiceController {
    @Autowired
    InvoiceService invoiceService;

    @PostMapping()
    public InvoiceModel addInvoice(@RequestBody InvoiceModel invoice) {
        return this.invoiceService.addInvoice(invoice);
    }

    @GetMapping("/query")
    public ArrayList<InvoiceModel> findByCustomerId(@RequestParam("customerId") Long customerId) {
        return this.invoiceService.findByCustomerId(customerId);
    }
}
