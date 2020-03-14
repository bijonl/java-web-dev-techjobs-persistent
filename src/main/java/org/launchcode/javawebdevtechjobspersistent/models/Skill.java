package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.Valid;

@Entity
public class Skill extends AbstractEntity {

    @Valid
    private String description;

    public Skill(@Valid String description) {
        this.description = description;
    }

    public Skill() {}

    public String getSkill() {
        return description;
    }

    public void setSkill(String skill) {
        this.description = skill;
    }
}