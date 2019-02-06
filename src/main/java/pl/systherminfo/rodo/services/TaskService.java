package pl.systherminfo.rodo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.systherminfo.rodo.models.entity.Client;
import pl.systherminfo.rodo.models.entity.Person;
import pl.systherminfo.rodo.models.entity.Task;
import pl.systherminfo.rodo.models.entity.Topic;
import pl.systherminfo.rodo.models.repository.ClientRepository;
import pl.systherminfo.rodo.models.repository.PersonRepository;
import pl.systherminfo.rodo.models.repository.TaskRepository;
import pl.systherminfo.rodo.models.repository.TopicRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    private final PersonRepository personRepository;
    private final ClientRepository clientRepository;
    private final TopicRepository topicRepository;
    private final TaskRepository taskRepository;

    @Autowired
    public TaskService(PersonRepository personRepository, ClientRepository clientRepository, TopicRepository topicRepository, TaskRepository taskRepository) {
        this.personRepository = personRepository;
        this.clientRepository = clientRepository;
        this.topicRepository = topicRepository;
        this.taskRepository = taskRepository;
    }

    public List<Task> getTasks() {
        return taskRepository.findAll();
    }

    public List<Person> getPersons() {
        return personRepository.findAll();
    }

    public List<Client> getClients() {
        return clientRepository.findAll();
    }

    public List<Topic> getTopics() {
        return topicRepository.findAll();
    }

    public void createTask(int personId, int clientId, int topicId, boolean hasPersonalData) {
        Optional<Person> person = personRepository.findById(personId);
        Optional<Client> client = clientRepository.findById(clientId);
        Optional<Topic> topic = topicRepository.findById(topicId);
        if (person.isPresent() && client.isPresent() && topic.isPresent()) {
            taskRepository.save(new Task(
                    person.get(),
                    client.get(),
                    topic.get(),
                    hasPersonalData
            ));
        }
    }
}
