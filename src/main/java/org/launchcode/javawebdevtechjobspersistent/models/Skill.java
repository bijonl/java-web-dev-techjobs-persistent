package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    @NotBlank
    @Size(message = "Too Long of a Message", max = 500)
    private String description;

    @ManyToMany(mappedBy = "skills")
    private List<Job> job;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Job> getJob() {
        return job;
    }

    public void setJob(List<Job> job) {
        this.job = job;
    }

    public Skill() {}
}