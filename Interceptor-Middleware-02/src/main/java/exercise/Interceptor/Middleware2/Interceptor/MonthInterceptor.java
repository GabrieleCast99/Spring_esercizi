package exercise.Interceptor.Middleware2.Interceptor;

import exercise.Interceptor.Middleware2.Entity.Month;
import io.micrometer.common.util.StringUtils;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Component
public class MonthInterceptor implements HandlerInterceptor {

    private List<Month> months= new ArrayList<>(Arrays.asList(

            new Month(1, "January", "Gennaio", "Januar"),
            new Month(2, "February", "Febbraio", "Februar"),
            new Month(3, "March", "Marzo", "März"),
            new Month(4, "April", "Aprile", "April"),
            new Month(5, "May", "Maggio", "Mai"),
            new Month(6, "June", "Giugno", "Juni")


    ));





    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String monthNumber = request.getHeader("monthNumber");
        if (monthNumber==null) {
            response.sendError(HttpStatus.BAD_REQUEST.value(), "Month number cannot be null or empty");
            return true;
        }

        Optional<Month> monthOptional = months.stream()
                .filter(month -> month.getMonthNumber() == Integer.parseInt(monthNumber))
                .findFirst();

        if (monthOptional.isPresent()) {
            request.setAttribute("month", monthOptional.get());
            return true;
        } else {
            request.setAttribute("month", new Month(0, "nope", "nope", "nope"));
            return true;
        }
    }


    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {
    }

}
