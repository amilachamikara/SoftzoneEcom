package mvc.controllers;


import com.sun.org.apache.xpath.internal.operations.Mod;
import com.sun.security.auth.UserPrincipal;
import core.domain.Product;
import core.domain.Seller;
import core.services.ProductService;
import core.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.support.SecurityContextProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;
import java.util.List;

/**
 * Created by Amila on 1/13/16.
 */
@Controller
@RequestMapping("/products/")
public class ProductController {

    @Autowired
    private ProductService productService;
    @Autowired
    private UserService userService;

    // GET: products/index
    @RequestMapping("index")
    public ModelAndView index(){

        List<Product> productList = productService.getAllProducts();
        ModelAndView mv = new ModelAndView("/products/index");
        mv.addObject("pList", productList);



        return mv;
    }

    // GET: products/details/5
    @RequestMapping("details/{id}")
    public ModelAndView details(@PathVariable int id){
        Product product = productService.getProduct(id);
        ModelAndView mv = new ModelAndView("/products/details");
        mv.addObject("product", product);
        return mv;
    }

    // GET: products/create
    @RequestMapping("create")
    public ModelAndView create(){
        ModelAndView mv = new ModelAndView("/products/create");
        Product product = new Product();
        mv.addObject("product", product);
        return mv;
    }

    // POST: products/create
    @RequestMapping(value = "create", method = RequestMethod.POST)
    public ModelAndView create(Product product, Principal principal){

        ModelAndView mv = new ModelAndView();

        User user = (User) ((Authentication)principal).getPrincipal();
        Seller seller = (Seller) userService.getUserByUsername(user.getUsername());
        try{
            product.setSeller(seller);
            productService.saveOrUpdate(product);
            mv.setViewName("redirect:/products/index");
        }catch (Exception e){
            e.printStackTrace();
            mv.setViewName("redirect:/products/create");
        }

        return mv;
    }

    // GET: products/update/5
    @RequestMapping("update/{id}")
    public ModelAndView edit(@PathVariable int id){
        ModelAndView mv = new ModelAndView("/products/update");
        Product product = productService.getProduct(id);
        mv.addObject("product", product);
        return mv;
    }

    // POST: products/update/5
    @RequestMapping(value = "update/{id}", method = RequestMethod.POST)
    public ModelAndView edit(@PathVariable int id, Product product){
        ModelAndView mv = new ModelAndView();
        try{
            product.setId(id);
            productService.saveOrUpdate(product);
            mv.setViewName("redirect:/products/index");
        }catch (Exception e){
            e.printStackTrace();
            mv.setViewName("redirect:/products/update");
        }
        return mv;
    }

    // GET: products/delete/5
    @RequestMapping("delete/{id}")
    public ModelAndView delete(@PathVariable int id){
        ModelAndView mv = new ModelAndView("/products/delete");
        Product product = productService.getProduct(id);
        mv.addObject("product", product);
        return mv;
    }

    // POST: products/delete/5
    @RequestMapping(value = "delete/{id}", method = RequestMethod.POST)
    public ModelAndView delete(@PathVariable int id, Product product){
        ModelAndView mv = new ModelAndView();

        try{
            product.setId(id);
            productService.deleteProduct(product);
            mv.setViewName("redirect:/products/index");
        }catch (Exception e){
            e.printStackTrace();
            mv.setViewName("redirect:/products/delete/"+id);
        }
        return mv;
    }
}
