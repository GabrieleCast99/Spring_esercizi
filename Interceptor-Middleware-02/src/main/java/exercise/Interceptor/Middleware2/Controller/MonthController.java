package exercise.Interceptor.Middleware2.Controller;

import exercise.Interceptor.Middleware2.Entity.Month;
import exercise.Interceptor.Middleware2.Repo.monthRepo;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/months")
public class MonthController {

    @Autowired
    private monthRepo monthRepo;

    @PostMapping("/create")
    public Month createCar(@RequestBody Month month) {
        Month monthSaved = monthRepo.saveAndFlush(month);

        return monthSaved;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Month> getMonthById(@PathVariable int id, HttpServletRequest request) {
        Month month = (Month) request.getAttribute("month");
        HttpStatus status = month.getMonthNumber() == 0 ? HttpStatus.OK : HttpStatus.NOT_FOUND;
        return new ResponseEntity<>(month, status);


    }
}

