package pl.dietapp.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.dietapp.demo.services.ProductsServiceImpl;

@Controller
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    ProductsServiceImpl productsService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String showList(Model model){
        model.addAttribute("productsListAtr", productsService.getProductsList());
        return "productsListTH";
    }
}
