package com.bg.cloud.controller.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.Range;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * Created by bosun on 1/3/18.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PersonDTO {

    @Valid
    @NotNull
    private final String firstName;

    @Valid
    @NotNull
    @Range(min = 7300, max = 7302)
    private final Integer zipCode;

    @JsonCreator
    public PersonDTO(@JsonProperty(value = "firstName") String firstName, @JsonProperty(value = "zip") Integer zipCode) {
        this.firstName = firstName;
        this.zipCode = zipCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public Integer getZipCode() {
        return zipCode;
    }
}
