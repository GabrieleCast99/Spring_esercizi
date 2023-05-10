package co.develhope.customqueries1.entities;

import javax.persistence.Entity;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public enum FlightStatus {

    ONTIME,
    DELAYED,
    CANCELLED;

    private static final List<FlightStatus> VALUES =
            Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static FlightStatus randomLetter() {
        return VALUES.get(RANDOM.nextInt(SIZE));

    }
}
