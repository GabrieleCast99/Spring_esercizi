package exercise.Spring.Repositories2.Controller;

import exercise.Spring.Repositories2.Entity.ProgrammingLanguage;
import exercise.Spring.Repositories2.Repository.PLRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ControllerHome {

@Autowired
    private PLRepository plRepository;

@PostMapping("/create")
    public ProgrammingLanguage createPL(@RequestBody ProgrammingLanguage PL){
    ProgrammingLanguage PLSaved = plRepository.save(PL);
    return PLSaved;
    }

@GetMapping("/returnAll")
    public Page<ProgrammingLanguage> getAllPL(){
    return plRepository.findAll(PageRequest.of(0, 2));
}

    @PutMapping("/programmingLanguages/{id}/inventor")
    public ProgrammingLanguage updateProgrammingLanguageInventor(@PathVariable int id, @RequestBody ProgrammingLanguage inventor) {
        if(plRepository.existsById(id))  {
            inventor.setInventor(String.valueOf(inventor));
            ProgrammingLanguage newInventor= plRepository.saveAndFlush(inventor);
            return newInventor;
    }else {
            return null;
        }

}


}
