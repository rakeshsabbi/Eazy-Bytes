package com.eazybytes.accounts.mapper;

import com.eazybytes.accounts.dto.CustomerDto;
import com.eazybytes.accounts.entity.Customer;

public class CustomerMapper {

    public static CustomerDto mapToCustomerDto(Customer customer, CustomerDto customerDto){

        customerDto.setEmail(customer.getEmail());
        customerDto.setMobileNumber(customer.getMobileNumber());
        customerDto.setName(customer.getName());

        return customerDto;
    }

    public static Customer mapToCustomer(CustomerDto customerdto, Customer customer){

        customer.setEmail(customerdto.getEmail());
        customer.setName(customerdto.getName());
        customer.setMobileNumber(customerdto.getMobileNumber());

        return customer;
    }

}
