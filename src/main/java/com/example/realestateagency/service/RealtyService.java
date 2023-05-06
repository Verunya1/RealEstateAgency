package com.example.realestateagency.service;

import com.example.realestateagency.model.Realty;
import com.example.realestateagency.repository.RealtyRepositories;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
//@Component
@RequiredArgsConstructor
@Slf4j
public class RealtyService {
    private final RealtyRepositories realtyRepositories;

    public List<Realty> listAds() {
//        if(city != null ) realtyRepositories.findRealtyByCity(city);
        return realtyRepositories.findAll();
    }

    public void saveAdvertisement(Realty realty) {
        log.info("Saving new {}", realty);
        realtyRepositories.save(realty);
    }

    public void deleteAdvertisement(Long id) {
        realtyRepositories.deleteById(id);
    }

    public Realty getAdvertisementById(Long id) {

        return realtyRepositories.findById(id).orElse(null);
    }

}
