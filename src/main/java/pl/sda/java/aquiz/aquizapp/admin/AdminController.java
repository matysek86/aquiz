package pl.sda.java.aquiz.aquizapp.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    @GetMapping("admin")
    public String showAdminSite (){
        return "adminForm";
    }
}
