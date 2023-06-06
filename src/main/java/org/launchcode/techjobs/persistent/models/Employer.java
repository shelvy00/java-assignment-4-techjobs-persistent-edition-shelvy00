package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @JoinColumn(name="employer_id")
    @OneToMany()
    private final List<Job> jobs = new ArrayList<>();
    @NotBlank(message = "location is required")
    @Size(min = 3, max = 60, message = "Name must be between 3 and 60 characters")
    private String location;

    public Employer(String location) {
        this.location = location;
    }

    public Employer() {};

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
