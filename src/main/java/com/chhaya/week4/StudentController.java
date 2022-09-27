package com.chhaya.week4;
import java.io.Console;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.chhaya.week4.components.studentsData;
import com.chhaya.week4.model.Students;

import lombok.extern.slf4j.Slf4j;
@Controller
@Slf4j
public class StudentController 
{
   
    private List<Students> studentData;
    public StudentController(List<Students> students) {
        this.studentData = students;
    }

    @GetMapping("/")

    String returnProduct(ModelMap modelMap,@ModelAttribute("check") String check)
    {
        // log.info("Here is check value : {}",check);
        modelMap.addAttribute("students",studentData);
        modelMap.addAttribute("check", check);
        return "student/student";
    }

    @GetMapping("/create")
    String createdPage(ModelMap modelMap)
    {
        Students students = new Students();
        
        modelMap.addAttribute("students", students);
        return "student/createStudent";
    }

    @PostMapping("/create")
    String addStudents(@ModelAttribute Students students,ModelMap modelMap,RedirectAttributes redirectAttributes)
    {

        
        studentData.add(students);
        modelMap.addAttribute("students", students);
        redirectAttributes.addFlashAttribute("check","OK");
        return "redirect:/";
    }

    @RequestMapping("/deleteItem")

    String deleteitem(@ModelAttribute Students students,ModelMap modelMap)
    {
        
        return "redirect:/";
    }
}
