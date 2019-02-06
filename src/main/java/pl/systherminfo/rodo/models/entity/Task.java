package pl.systherminfo.rodo.models.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class Task {

    @Id
    @GeneratedValue
    private int id;

    private Date date;

    @ManyToOne
    private Person person;

    @ManyToOne
    private Client client;

    @ManyToOne
    private Topic topic;

    private boolean hasPersonalData;

    public Task() {
    }

    public Task(Person person, Client client, Topic topic, boolean hasPersonalData) {
        this.date = new Date();
        this.person = person;
        this.client = client;
        this.topic = topic;
        this.hasPersonalData = hasPersonalData;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public boolean getHasPersonalData() {
        return hasPersonalData;
    }

    public void setHasPersonalData(boolean hasPersonalData) {
        this.hasPersonalData = hasPersonalData;
    }
}