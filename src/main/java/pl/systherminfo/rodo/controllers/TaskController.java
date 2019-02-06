package pl.systherminfo.rodo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.systherminfo.rodo.services.TaskService;

@Controller
public class TaskController {

    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/")
    public String list(ModelMap model) {
        model.put("tasks", taskService.getTasks());
        return "list";
    }

    @GetMapping("dodaj")
    public String add(ModelMap model) {
        model.put("persons", taskService.getPersons());
        model.put("clients", taskService.getClients());
        model.put("topics", taskService.getTopics());
        return "add";
    }

    @PostMapping("utworz")
    public String create(
            @RequestParam int person,
            @RequestParam int client,
            @RequestParam int topic,
            @RequestParam(defaultValue = "false") boolean hasPersonalData
    ) {
        taskService.createTask(person, client, topic, hasPersonalData);
        return "create";
    }
}
