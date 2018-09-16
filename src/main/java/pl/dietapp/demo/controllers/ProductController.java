package pl.dietapp.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.dietapp.demo.entity.Product;
import pl.dietapp.demo.services.ProductsServiceImpl;

@Controller
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    ProductsServiceImpl productsService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String showList(Model model){
        model.addAttribute("productsListAtr", productsService.getProductsList());
        return "products/productsListTH";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addProductForm(Model model){
        model.addAttribute("product", new Product());
        return "products/productAddForm";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String saveProduct(@ModelAttribute Product product){
        productsService.saveProduct(product);
        return "products/productAddedMessage";
    }
}
