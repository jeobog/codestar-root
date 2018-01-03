package com.bg.cloud.controller;

import com.bg.cloud.controller.dto.CustomerDTO;
import com.bg.cloud.controller.dto.PersonDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * Created by bosun on 1/3/18.
 */
@RestController
@RequestMapping(value = "/api/v1/customers", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
public class CustomerResource {

    @Autowired
    private ModelMapper modelMapper;

    @RequestMapping(method = RequestMethod.POST)
    public CustomerDTO createCustomer(@NotNull @Valid @RequestBody PersonDTO personDTO) {
        CustomerDTO customerDTO = modelMapper.map(personDTO, CustomerDTO.class);
        return customerDTO;
    }

}
