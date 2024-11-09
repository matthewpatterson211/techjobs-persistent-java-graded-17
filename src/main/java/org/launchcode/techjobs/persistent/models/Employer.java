package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank
    @Size(min = 3, max = 100)
    private String location;

    @JoinColumn(name = "employer_id")
    @OneToMany
    private final List<Job> jobs= new ArrayList<>();

    public Employer() {
    }

    public @NotBlank @Size(min = 3, max = 100) String getLocation() {
        return location;
    }

    public void setLocation(@NotBlank @Size(min = 3, max = 100) String location) {
        this.location = location;
    }


}
