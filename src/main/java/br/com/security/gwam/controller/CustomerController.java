package br.com.security.gwam.controller;

import br.com.security.gwam.model.Customer;
import br.com.security.gwam.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping("/save")
    public int save(@RequestBody List<Customer> customers){
        customerRepository.saveAll(customers);
        return customers.size();
    }

    @GetMapping("/findAll")
    public Iterable<Customer> findAll(){
        return customerRepository.findAll();
    }

    @GetMapping("/findByName/{firstName}")
    public List<Customer> findByFirstName(@PathVariable String firstName){
        return customerRepository.findByFirstName(firstName);
    }

}
