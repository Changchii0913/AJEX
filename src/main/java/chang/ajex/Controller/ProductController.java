package chang.ajex.Controller;

import chang.ajex.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {

    @Autowired
    ProductService productService;
    @GetMapping("/showproduct")
    public String showProduct(Model model) {
        //Product p = productService.getProduct();
        //model.addAttribute("product", p);
        return "product_detail";
    }
}