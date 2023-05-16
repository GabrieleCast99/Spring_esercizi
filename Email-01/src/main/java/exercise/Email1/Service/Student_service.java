package exercise.Email1.Service;

import exercise.Email1.Entity.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class Student_service {

    List<Student> student= new ArrayList<>();
    public Student_service(){
        student.add(new Student("1","Gabriele","castiglione","gabriele.castiglione@libero.it"));
        student.add(new Student("2","samue","casti","samu.casti@example.it"));
        student.add(new Student("3","Mario","Rossi","mario.rossi@example.com"));
        student.add(new Student("4","Luigi","Verdi","luigi.verdi@example.com"));

    }


    public Student getStudentById(String id){
        Optional<Student> studentFromDb = student.stream().filter(student ->student.getId().equals(id) ).findAny();
        if(studentFromDb.isPresent()) {return studentFromDb.get();
        }
        return null;
    }

}
