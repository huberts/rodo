package pl.systherminfo.rodo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TaskController {

    @GetMapping("/")
    public String list() {
        return "list";
    }

    @GetMapping("dodaj")
    public String add() {
        System.out.println("HELLO XXX");
        return "yyy";
    }
}
