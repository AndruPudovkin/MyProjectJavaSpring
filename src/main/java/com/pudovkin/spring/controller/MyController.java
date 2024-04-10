package com.pudovkin.spring.controller;


import com.pudovkin.spring.entity.*;
import com.pudovkin.spring.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
public class MyController {
    @Autowired
    private ToyService toyService;
    @Autowired
    private CategoryAgeService categoryAgeService;
    @Autowired
    private CategoryToyService categoryToyService;
    @Autowired
    private ManufacturerToyService manufacturerToyService;
    @Autowired
    private MaterialToyService materialToyService;

    @RequestMapping("/")
    public String startList(){
        return "start-list";
    }
//-----------------Toy------------------------------
    @RequestMapping("/showAllBd")
    public String showAllToys(Model model){
        List<Toy> allToys = toyService.getAllToys();
        model.addAttribute("allToyList", allToys);
        return "all-toys";
    }

    @RequestMapping("/addNewToy")
    public String addNewToy(Model model){
        Toy toy = new Toy();
        Map<String,String> mapCategoryAge = categoryAgeService.getMapAllCategoryAge();
        Map<String,String> mapCategory = categoryToyService.getMapAllCategory();
        Map<String,String> mapManufacturer = manufacturerToyService.getMapAllManufacturerToy();
        Map<String,String> mapMaterial = materialToyService.getMapAllMaterialToy();
        model.addAttribute("toy", toy);
        model.addAttribute("mapAge",mapCategoryAge);
        model.addAttribute("mapCategory",mapCategory);
        model.addAttribute("mapManufacturer",mapManufacturer);
        model.addAttribute("mapMaterial",mapMaterial);
        return "toy-info";
    }

    @RequestMapping("/saveToy")
    public String saveToy(@ModelAttribute("toy") Toy toy){
        toyService.saveToy(toy);
        return "redirect:/showAllBd";
    }

    @RequestMapping("/updateInfo")
    public String updateToy(@RequestParam("toyID") int id, Model model){
        Toy toy = toyService.getToy(id);
        Map<String,String> mapCategoryAge = categoryAgeService.getMapAllCategoryAge();
        Map<String,String> mapCategory = categoryToyService.getMapAllCategory();
        Map<String,String> mapManufacturer = manufacturerToyService.getMapAllManufacturerToy();
        Map<String,String> mapMaterial = materialToyService.getMapAllMaterialToy();
        model.addAttribute("toy", toy);
        model.addAttribute("mapAge",mapCategoryAge);
        model.addAttribute("mapCategory",mapCategory);
        model.addAttribute("mapManufacturer",mapManufacturer);
        model.addAttribute("mapMaterial",mapMaterial);
        return "toy-info";
    }

    @RequestMapping("/deleteToy")
    public String deleteToy(@RequestParam("toyID") int id){
        toyService.deleteToy(id);
        return "redirect:/showAllBd";
    }

//-----------------CategoryAge------------------------------
    @RequestMapping("/showAllCategoryAge")
    public String showAllaCategoryAge(Model model){
        List<CategoryAgeToy> categoryAgeToys = categoryAgeService.getAllCategoryAge();
        model.addAttribute("categorys", categoryAgeToys);
        return "all-category-age";
    }

    @RequestMapping("/addNewCategoryAge")
    public String addNewCategoryAge(Model model){
        CategoryAgeToy categoryAgeToy = new CategoryAgeToy();
        model.addAttribute("category", categoryAgeToy);
        return "category-age-info";
    }
    @RequestMapping("/saveCategoryAge")
    public String saveCategoryAge(@ModelAttribute("category") CategoryAgeToy categoryAgeToy){
        categoryAgeService.saveCategoryAgeToy(categoryAgeToy);
        return "redirect:/showAllCategoryAge";
    }

    @RequestMapping("/updateCategoryAge")
    public String updateCategoryAge(@RequestParam("categoryId") int id, Model model){
        CategoryAgeToy categoryAgeToy = categoryAgeService.getCategoryAgeToy(id);
        model.addAttribute("category", categoryAgeToy);
        return "category-age-info";
    }

    @RequestMapping("/deleteCategoryAge")
    public String deleteCategoryAge(@RequestParam("categoryId") int id){
        categoryAgeService.deleteCategoryAgeToy(id);
        return "redirect:/showAllCategoryAge";
    }

//-----------------CategoryToy------------------------------
    @RequestMapping("/showAllCategoryToy")
    public String showAllaCategoryToy(Model model){
        List<CategoryToy> categoryToys = categoryToyService.getAllCategoryToy();
        model.addAttribute("categorys", categoryToys);
    return "all-category-toy";
}

    @RequestMapping("/addNewCategoryToy")
    public String addNewCategoryToy(Model model){
        CategoryToy categoryToy = new CategoryToy();
        model.addAttribute("category", categoryToy);
        return "category-toy-info";
    }
    @RequestMapping("/saveCategoryToy")
    public String saveCategoryToy(@ModelAttribute("category") CategoryToy categoryToy){
        categoryToyService.saveCategoryToy(categoryToy);
        return "redirect:/showAllCategoryToy";
    }

    @RequestMapping("/updateCategoryToy")
    public String updateCategoryToy(@RequestParam("categoryId") int id, Model model){
        CategoryToy categoryToy = categoryToyService.getCategoryToy(id);
        model.addAttribute("category", categoryToy);
        return "category-toy-info";
    }

    @RequestMapping("/deleteCategoryToy")
    public String deleteCategoryToy(@RequestParam("categoryId") int id){
        categoryToyService.deleteCategoryToy(id);
        return "redirect:/showAllCategoryToy";
    }
//-----------------ManufacturerToy------------------------------
    @RequestMapping("/showAllManufacturerToy")
    public String showAllaManufacturerToy(Model model) {
        List<ManufacturerToy> manufacturerToys = manufacturerToyService.getAllManufacturerToy();
        model.addAttribute("categorys", manufacturerToys);
        return "all-category-manufacturer";
    }

    @RequestMapping("/addNewManufacturerToy")
    public String addNewManufacturerToy(Model model){
        ManufacturerToy manufacturerToy = new ManufacturerToy();
        model.addAttribute("category", manufacturerToy);
        return "category-manufacturer-info";
    }
    @RequestMapping("/saveManufacturerToy")
    public String saveManufacturerToy(@ModelAttribute("category") ManufacturerToy manufacturerToy){
        manufacturerToyService.saveManufacturerToy(manufacturerToy);
        return "redirect:/showAllManufacturerToy";
    }

    @RequestMapping("/updateManufacturerToy")
    public String updateManufacturerToy(@RequestParam("categoryId") int id, Model model){
        ManufacturerToy manufacturerToy = manufacturerToyService.getManufacturerToy(id);
        model.addAttribute("category", manufacturerToy);
        return "category-manufacturer-info";
    }

    @RequestMapping("/deleteManufacturerToy")
    public String deleteManufacturerToy(@RequestParam("categoryId") int id){
        manufacturerToyService.deleteManufacturerToy(id);
        return "redirect:/showAllManufacturerToy";
    }
//-----------------MaterialToy------------------------------
    @RequestMapping("/showAllMaterialToy")
    public String showAllMaterialToy(Model model) {
        List<MaterialToy> materialToys = materialToyService.getAllMaterialToy();
        model.addAttribute("categorys", materialToys);
        return "all-category-material";
    }

    @RequestMapping("/addNewMaterialToy")
    public String addNewMaterialToy(Model model){
        MaterialToy materialToy = new MaterialToy();
        model.addAttribute("category", materialToy);
        return "category-material-info";
    }
    @RequestMapping("/saveMaterialToy")
    public String saveMaterialToy(@ModelAttribute("category") MaterialToy materialToy){
        materialToyService.saveMaterialToy(materialToy);
        return "redirect:/showAllMaterialToy";
    }

    @RequestMapping("/updateMaterialToy")
    public String updateMaterialToy(@RequestParam("categoryId") int id, Model model){
        MaterialToy materialToy = materialToyService.getMaterialToy(id);
        model.addAttribute("category", materialToy);
        return "category-material-info";
    }

    @RequestMapping("/deleteMaterialToy")
    public String deleteMaterialToy(@RequestParam("categoryId") int id){
        materialToyService.deleteMaterialToy(id);
        return "redirect:/showAllMaterialToy";
    }
}
