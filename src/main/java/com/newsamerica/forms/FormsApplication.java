package com.newsamerica.forms;

import com.newsamerica.forms.model.Campaign;
import com.newsamerica.forms.model.FormTemplate;
import com.newsamerica.forms.model.Question;
import com.newsamerica.forms.model.QuestionType;
import com.newsamerica.forms.repo.CampaignRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;


@SpringBootApplication
public class FormsApplication implements CommandLineRunner {


    @Autowired
    private CustomerRepository repository;

    @Autowired
    private CampaignRepository campaignRepository;

    public static void main(String[] args) {
        SpringApplication.run(FormsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        repository.deleteAll();

        // save a couple of customers
        repository.save(new Customer("Alice", "Smith"));
        repository.save(new Customer("Bob", "Smith"));
        repository.save(new Customer("X", "Y"));

        // fetch all customers
        System.out.println("Customers found with findAll():");
        System.out.println("-------------------------------");
        for (Customer customer : repository.findAll()) {
            System.out.println(customer);
        }
        System.out.println();

        // fetch an individual customer
        System.out.println("Customer found with findByFirstName('Alice'):");
        System.out.println("--------------------------------");
        System.out.println(repository.findByFirstName("Alice"));

        System.out.println("Customers found with findByLastName('Smith'):");
        System.out.println("--------------------------------");
        for (Customer customer : repository.findByLastName("Smith")) {
            System.out.println(customer);
        }

        campaignRepository.save(new Campaign(new FormTemplate(Arrays.asList(new Question(1, QuestionType.TEXT, "type something here.")))));
    }

}
