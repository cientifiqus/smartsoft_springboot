package la.smartsoft.factura.service;

import la.smartsoft.factura.entity.CustomerModel;
import la.smartsoft.factura.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository CustomerRepository;

    public ArrayList<CustomerModel> findAll() {
        return (ArrayList<CustomerModel>) CustomerRepository.findAll();
    }
    public CustomerModel addCustomer(CustomerModel customer) {
        return CustomerRepository.save(customer);
    }
}
