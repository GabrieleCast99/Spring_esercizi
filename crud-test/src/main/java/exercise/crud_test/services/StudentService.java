package exercise.crud_test.services;

import exercise.crud_test.entities.Student;
import exercise.crud_test.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student setStudentIsWorkingStatus(Long id, boolean isWorking){
        Optional<Student> student = studentRepository.findById(id);
        if(!student.isPresent())
            return null;
        student.get().setWorking(isWorking);
        return studentRepository.save(student.get());
    }
}
