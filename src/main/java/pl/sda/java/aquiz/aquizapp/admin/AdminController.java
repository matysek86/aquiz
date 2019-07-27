package pl.sda.java.aquiz.aquizapp.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.sda.java.aquiz.aquizapp.entities.QuestionEntity;
import pl.sda.java.aquiz.aquizapp.entities.QuestionnaireEntity;
import pl.sda.java.aquiz.aquizapp.service.QuestionnaireRepository;

import java.util.List;

@Controller
public class AdminController {

    @Autowired
    QuestionnaireRepository questionnaireRepository;

    @GetMapping("admin")
    public String showAdminSite (){
        return "adminForm";
    }

//    @GetMapping("/")
//    public String showQuestrionnaires(Model model){
//        List<QuestionnaireEntity> adminQnairelist = questionnaireRepository.findAll();
//        model.addAttribute("adminQuestionaireList", adminQnairelist);
//        return "adminqnairelist";
    }


