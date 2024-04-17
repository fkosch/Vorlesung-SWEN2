package com.example.velocities.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import jakarta.persistence.*;
import javax.validation.constraints.NotBlank;

import java.io.Serializable;

@Entity
@Table(name = "velocities")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"created", "updated"}, allowGetters = true)
public class Velocity implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -7475221213430741267L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

	@NotBlank
    private String animal;

    @NotBlank
    private String velocity;

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAnimal() {
		return animal;
	}

	public void setAnimal(String animal) {
		this.animal = animal;
	}

	public String getVelocity() {
		return velocity;
	}

	public void setVelocity(String velocity) {
		this.velocity = velocity;
	}

}