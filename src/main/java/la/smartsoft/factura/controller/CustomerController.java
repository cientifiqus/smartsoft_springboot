package la.smartsoft.factura.controller;

import la.smartsoft.factura.entity.CustomerModel;
import la.smartsoft.factura.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @GetMapping()
    public ArrayList<CustomerModel> findAll() {
        return customerService.findAll();
    }

    @PostMapping()
    public CustomerModel addCustomer(@RequestBody CustomerModel customer) {
        return this.customerService.addCustomer(customer);
    }
}
