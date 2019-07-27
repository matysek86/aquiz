package pl.sda.java.aquiz.aquizapp;

import net.bytebuddy.implementation.bytecode.assign.TypeCasting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.sda.java.aquiz.aquizapp.entities.QuestionnaireEntity;
import pl.sda.java.aquiz.aquizapp.entities.QuizEntitiy;
import pl.sda.java.aquiz.aquizapp.service.QuestionnaireRepository;
import pl.sda.java.aquiz.aquizapp.service.QuizRepository;

import javax.persistence.EntityNotFoundException;

import java.util.List;

import java.util.Optional;


@Controller
public class MainController {

    @Autowired
    QuestionnaireRepository questionnaireRepository;

    @Autowired
    QuizRepository quizRepository;

    //    @GetMapping("/")
//    public String showMainForm(){
//        return "index";
//    }
    @GetMapping("/")
    public String showQuestrionnaires(Model model) {
        List<QuestionnaireEntity> allQnairelist = questionnaireRepository.findAll();
        List<QuizEntitiy> allQuizlist = quizRepository.findAll();
//         Map<String,Object> attribuses = new TreeMap<>();
//                 attribuses.put("allQuestionaireList",allQnairelist);
//                 attribuses.put("allQuizList",allQuizlist);
//                 model.mergeAttributes(attribuses);
        model.addAttribute("allQuestionaireList", allQnairelist);
        model.addAttribute("allQuizList", allQuizlist);
        return "index";
    }

// @GetMapping("/qnaire") // /admin/user?id=2
// public String getQnaireForEdit(@RequestParam Long idQuestionnaire, Model model) {
////        log.info("Get user to edit with id={}", id);
////
//     Optional<QuestionnaireEntity> optionalquestionaire = questionnaireRepository.findById(idQuestionnaire);
//     if (!optionalquestionaire.isPresent()) {
//         throw new EntityNotFoundException();
//     }
//     EditUserForm editUserForm = EditUserForm.create(optionalUser.get());
//     model.addAttribute("editUserForm", editUserForm);
//     return "admin/editUser}";
//////
//
//    @PostMapping("/user")
//    public String editUserSave(@ModelAttribute("editUserForm") @Valid EditUserForm user,
//                               BindingResult bindingResult,
//                               Model model,
//                               RedirectAttributes redirectAttributes) {
//        if (bindingResult.hasErrors()) {
////            model.addAttribute("id", user.getId());
//            model.addAttribute("user", user);
//            return "/admin/editUser";
//        }
//        System.out.println(user);
//        return "redirect:/admin/user?id="+user.getId();
//    }
//
}
