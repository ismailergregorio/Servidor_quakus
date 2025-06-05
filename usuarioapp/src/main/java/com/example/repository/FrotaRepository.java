package com.example.repository;

import com.example.models.Frota;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class FrotaRepository implements PanacheRepository<Frota>{
 
}
