package com.example.projeto_final;

import com.example.projeto_final.controller.PersonController;
import com.example.projeto_final.model.Employee;
import com.example.projeto_final.model.ennumeration.EducationLevel;
import com.example.projeto_final.model.ennumeration.Job;
import com.example.projeto_final.model.ennumeration.MaritialStatus;

import java.time.LocalDateTime;
import java.util.Date;

public class tests {
    public static void main(String[] args) throws Exception {
        PersonController personController = PersonController.getInstance();
        Employee employeeA = new Employee("Thais", "(11) 77777-7777", LocalDateTime.of(1995,7,5,0,0), "555.555.555-88", "Recife", "55.485.488-9", MaritialStatus.MARRIED, EducationLevel.COLLEGE, Job.WAITER,5252352, new Date(2002,2,1), true,true);

        personController.save(employeeA);
        Employee employeeB = new Employee("William", "(11) 77777-7777", LocalDateTime.of(1995,10,5,0,0), "555.555.555-98", "Recife", "55.485.488-9", MaritialStatus.MARRIED, EducationLevel.COLLEGE, Job.MANAGER,5252352, new Date(2002,2,1), true,true);

        personController.save(employeeB);

        System.out.println(personController.getAll());

    }
}
