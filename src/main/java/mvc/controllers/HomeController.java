package mvc.controllers;

import core.domain.Product;
import core.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


/**
 * Created by Amila on 1/12/16.
 */
@Controller
public class HomeController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/gallery")
    public ModelAndView gallery(){
        ModelAndView mv = new ModelAndView("gallery");

        List<Product> productList = productService.getAllProducts();
        mv.addObject("productList", productList);

        return mv;
    }

    @RequestMapping("/admin")
    @ResponseBody
    public String admin(){
        return "Admin Page";
    }

}
