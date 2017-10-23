package com.reddragon.jstolorz.com.reddragon.jstolorz.entity;

import javax.validation.constraints.*;

public class Customer {

    private String firstName;

    @Min(value = 0, message = "must be greater than or equal to zero")
    @Max(value = 10,message = "must be less than or equal to 10")
    private int freePasses;

    @NotNull(message = "lastName is required")
    @Size(min = 1, message = "size is required")
    private String lastName;

    @Pattern(regexp = "[0-9]{2}-[0-9]{3}",message = "format 00-000")
    private String postalCode;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(int freePasses) {
        this.freePasses = freePasses;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
