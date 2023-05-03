package exercise.Interceptor.Middleware2.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Month {

    private int monthNumber;
    private String englishName;
    private String italianName;
    private String germanName;


    public Month() {
        this.monthNumber = monthNumber;
        this.englishName = englishName;
        this.italianName = italianName;
        this.germanName = germanName;
    }
}
