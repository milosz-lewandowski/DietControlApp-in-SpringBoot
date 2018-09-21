package pl.dietapp.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.dietapp.demo.entity.Category;
import pl.dietapp.demo.services.CategoriesServiceImpl;

@Controller
@RequestMapping(value = "/category")
public class CategoryController {

    @Autowired
    CategoriesServiceImpl categoriesService;

    @RequestMapping(value = "/panel", method = RequestMethod.GET)
    public String categoryPanel(Model model){
        model.addAttribute("categoriesList", categoriesService.getCategories());
        model.addAttribute("newCategory", new Category());
        return "categories/categoriesPanel.html";
    }

    @RequestMapping(value = "/panel", method = RequestMethod.POST)
    public String addCategory(@ModelAttribute Category newCategory){
        categoriesService.saveCategory(newCategory);
        return "categories/categoriesPanel.html";
    }
}
