package pl.dietapp.demo.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.dietapp.demo.entity.Category;
import pl.dietapp.demo.services.CategoriesService;

@Controller
@RequestMapping(value = "/category")
@RequiredArgsConstructor
public class CategoryController {

    private final CategoriesService categoriesService;

    @RequestMapping(value = "/panel", method = RequestMethod.GET)
    public String categoryPanel(Model model){
        model.addAttribute("categoriesList", categoriesService.getCategories());
        return "categories/categoriesPanel.html";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addCategory(Model model){
        model.addAttribute("category", new Category());
        return "categories/categoryAddForm.html";
    }



    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addedCategory(@ModelAttribute Category category){
        if (category == null) throw new RuntimeException("Trying to save null cateory");
        categoriesService.saveCategory(category);
        return "categories/categoryAdded";
    }

    @RequestMapping(value = "/edit/{categoryId}", method = RequestMethod.GET)
    public String editCategory(Model model, @PathVariable int categoryId){
        model.addAttribute(categoriesService.getCategoryById(categoryId));
        return "categoryEditForm";
    }
}
