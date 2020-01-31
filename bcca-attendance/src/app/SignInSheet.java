package app;

import java.io.Serializable;

public class SignInSheet implements Serializable {
    private static final long serialVersionUID = 1L;
    String name;
    String day;
    String time;
    Integer tardies;
    Integer absences;
    Integer partialAbsences;

    public SignInSheet(String name, String day, String time) {
        this.name = name;
        this.day = day;
        this.time = time;
        this.tardies = 0;
        this.absences = 0;
        this.partialAbsences = 0;
    }
}