package la.smartsoft.factura.controller;

import la.smartsoft.factura.entity.InvoiceDetailModel;
import la.smartsoft.factura.service.InvoiceDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/invoiceDetail")
public class InvoiceDetailController {
    @Autowired
    InvoiceDetailService invoiceDetailService;

    @PostMapping()
    public InvoiceDetailModel addInvoiceDetail(@RequestBody InvoiceDetailModel invoiceDetail) {
        return this.invoiceDetailService.addInvoiceDetail(invoiceDetail);
    }

    @GetMapping("/query")
    public ArrayList<InvoiceDetailModel> findByInvoiceId(@RequestParam("invoiceId") Long invoiceId) {
        return this.invoiceDetailService.findByInvoiceId(invoiceId);
    }
}
