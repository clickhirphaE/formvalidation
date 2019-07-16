package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class HomeController {
    @GetMapping("/tvform")
    public String loadTvForm(Model model){
        model.addAttribute("tvshow",new Tvshow());
        /*--------------------------------------------------------------
        the entries made by the user are being
         put into the newly created empty object above by the controller
          and passed to tvform.html
          If values entered are (invalid),tvform.html will be displayed
          with the default
          error messages for the errors encountered.
          If the values entered are valid,tvshowconfirm.html will be shown
          -----------------------------------------------------------------
          */

        return "tvform";
    }
    @PostMapping("/tvform")
    public String processTvform(@Valid Tvshow tvshow, BindingResult result){
        if(result.hasErrors()){
    return "tvform";
    }
    return "tvshowconfirm";
    }}

