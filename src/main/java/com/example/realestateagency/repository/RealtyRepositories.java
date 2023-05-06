package com.example.realestateagency.repository;

import com.example.realestateagency.model.Realty;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RealtyRepositories extends JpaRepository<Realty,Long> {
    List<Realty> findRealtyByCity(String city);
}
