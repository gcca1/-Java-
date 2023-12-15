package com.gcc.javacore.day18第四章对象和对象的引用Date和LocalDateTime;

import java.time.LocalDateTime;
import java.util.Date;

public class Employee {
    private Date hireDay;

    private LocalDateTime dateTime;
    public Date getHireDay() {
        return hireDay;
    }

    public void setHireDay(Date hireDay) {
        this.hireDay = hireDay;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
}
