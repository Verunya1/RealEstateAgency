package com.example.realestateagency.controller;

import com.example.realestateagency.model.Realty;
import com.example.realestateagency.service.RealtyService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/advertisement")
public class RealtyController {

    private final RealtyService realtyService;

    @GetMapping()
    public String getAdvertisement( Model model) {
        model.addAttribute("ads", realtyService.listAds());
        return "ads";
    }

    @GetMapping("/{id}")
    public String advertisementInfo(@PathVariable("id") Long id, Model model) {
        model.addAttribute("advertisement", realtyService.getAdvertisementById(id));
        return "advertisement_info";
    }

    @GetMapping("/new")
    public String newAdvertisement(@ModelAttribute("advertisement") Realty realty) {
        return "add_advertisement";
    }

    @PostMapping()
    public String createAdvertisement(@ModelAttribute("advertisement") Realty realty) {
        realtyService.saveAdvertisement(realty);
        return "redirect:/advertisement";
    }

    @PostMapping("/{id}")
    public String deleteAdvertisement(@PathVariable("id") Long id){
        realtyService.deleteAdvertisement(id);
        return "redirect:/advertisement";
    }
}
