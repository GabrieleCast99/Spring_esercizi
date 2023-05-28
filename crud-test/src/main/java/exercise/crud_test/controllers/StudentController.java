package exercise.crud_test.controllers;

import exercise.crud_test.entities.Student;
import exercise.crud_test.repositories.StudentRepository;
import exercise.crud_test.services.StudentService;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private StudentService studentService;


    @PostMapping("/create")
    public @ResponseBody Student create(@RequestBody Student student){
        return studentRepository.save(student);
    }


    @GetMapping("/getAll")
    public @ResponseBody List<Student> getStudents(){
        return studentRepository.findAll();
    }


    @GetMapping("/{id}")
    public @ResponseBody  Student getAStudent(@PathVariable long id){
        Optional<Student> student =  studentRepository.findById(id);
        if(student.isPresent()){
            return student.get();
        }else{
            return null;
        }
    }


    @PutMapping("/{id}")
    public @ResponseBody Student update(@PathVariable long id, @RequestBody  @NotNull Student student){
        student.setId(id);
        return studentRepository.save(student);
    }


    @PutMapping("/{id}/work")
    public @ResponseBody Student setStudentIsWorking(@PathVariable long id, @RequestParam("working") boolean working){
        return studentService.setStudentIsWorkingStatus(id, working);
    }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id){
        studentRepository.deleteById(id);
    }
}
