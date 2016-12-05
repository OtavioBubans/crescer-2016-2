/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula8.entities;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/**
 *
 * @author otavio.bubans
 */
@Controller
public class Example {

    @RequestMapping(value = "/")
    String toIndex(Model model) {
        model.addAttribute("name", "Otávio F. Bubans");
        return "index"; 
        
    }

}
