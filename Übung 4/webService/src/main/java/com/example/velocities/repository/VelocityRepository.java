package com.example.velocities.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.velocities.entity.Velocity;

@Repository
public interface VelocityRepository extends JpaRepository<Velocity, Long> {

}