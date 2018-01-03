package com.bg.cloud.controller.dto;

import com.bg.cloud.domain.dto.Address;

/**
 * Created by bosun on 1/3/18.
 */
public class CustomerDTO {

    private final String firstName;
    private final Address address;

    public CustomerDTO(String firstName, Address address) {
        this.firstName = firstName;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public Address getAddress() {
        return address;
    }
}
