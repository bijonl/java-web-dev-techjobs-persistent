package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.Valid;

@Entity
public class Employer extends AbstractEntity {

    @Valid
    private String location;

    public Employer(@Valid String location) {
        this.location = location;
    }

    public Employer() {}

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
