package controllers;

import models.TVShows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import tvshowrepo.TVShowsRepo;

import javax.validation.Valid;

public class MainController {
    @Autowired
    TVShowsRepo showsRepo;


    @GetMapping("/")
    public String defaultRequest(Model model){
        String myMessage = "welcome to the TV Shows Database";
        model.addAttribute("message", myMessage);
        return "welcome";
    }


    @GetMapping("/addshows")
    public String addBook(Model model) {
        model.addAttribute("newTVShows", new TVShows());
        return "addshows";
    }

    @PostMapping("/addshows")
    public String postBook(@Valid @ModelAttribute("newTVShows") TVShows tvShows, BindingResult bindingResult)
    {

        if(bindingResult.hasErrors()){
            return "addshows";
        }
        showsRepo.save(tvShows);
        return "result";
    }

    @GetMapping("/displayallshows")
    public String showAllBooks(Model model){

        Iterable<TVShows> allshows = TVShowsRepo.findAll();
        model.addAttribute("allshows", allshows);
        return "displayallshows";
    }

}
