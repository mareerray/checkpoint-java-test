import java.text.SimpleDateFormat;
import java.util.Date;

public class ProjectTime {
    private String startTime;
    private String endTime;
    private float hoursLogged;

    // Constructor to initialize the above fields and calculate hoursLogged
    public ProjectTime(String start, String end) {
        this.startTime = start;
        this.endTime = end;
        calculateHoursLogged();
    }

    // Setter: receive a String argument to update startTime and calculate hoursLogged
    public void setStartTime(String start) {
        this.startTime = start;
        calculateHoursLogged();
    }

    // Setter: receive a String argument to update endTime and calculate hoursLogged
    public void setEndTime(String end) {
        this.endTime = end;
        calculateHoursLogged();
    }

    // Getter: return the value of a private field
    public String getStartTime() {
        return startTime;
    }

    // Getter: return the value of a private field
    public String getEndTime() {
        return endTime;
    }

    // calculate duration based on startTime and endTime
    // set hoursLogged = calculated value OR -1 in case of error

    private void calculateHoursLogged() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            Date start = sdf.parse(startTime);
            Date end = sdf.parse(endTime);
            Long diffInMillis = end.getTime() - start.getTime();
            if (diffInMillis < 0) {
                hoursLogged = -1;
            } else {
                //long minutes = diffInMillis / (60 * 1000);
                hoursLogged = (float) diffInMillis / (60 * 60 * 1000f);
            }
        } catch (Exception e) {
            hoursLogged = -1;
        }
    }
    // Getter: return the value of a private field
    // It must return a formatted String representing the time between startTime and endTime
    // using the hoursLogged value.
    // The output format depends on the duration:
    // Less than 120 minutes = 2 hrs: hoursLogged m
    // Less than 120 hours: hoursLogged h
    // Less than 120 days = 2880 hrs: hoursLogged d
    // More than 120 days: hoursLogged mo
    public String getHoursLogged() {
        float diffInMins = hoursLogged * 60;

        if (hoursLogged < 0) return "-1";

        if (hoursLogged >= 0 && hoursLogged < 1) return ((int)diffInMins) + " m";

        if (hoursLogged >= 1 && hoursLogged < 120) return ((int)hoursLogged) + " h";

        if (hoursLogged < 1440) {
            return ((int)(hoursLogged / 24)) + " d";
        } else {
            return ((int)(hoursLogged+1) / (24 * 30)) + " mo";
        }
    }
}

/*
Setters have code similar to constructors because both are used to assign values to object fields,
but they’re used at different times and for different purposes:

Constructor:
This is called once when the object is created.
It sets up the object's initial state—all the fields that need values right away.

Setter:
This is called any time after the object is created if you want to change or update one of the fields later on.
Setters let you change the value of a field without creating a whole new object

* Every time the start or end time changes (either at the start or later),
you must recalculate hoursLogged so it always matches the current values.

Getter:
The getter method is just a public method that returns the value of a private field.
This is a fundamental part of Java encapsulation, allowing controlled access to a class's data.
*/

