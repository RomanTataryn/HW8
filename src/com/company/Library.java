package com.company;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<LocalDate, String> report = new HashMap<>();

    public void takeBook(LocalDate date, String bookName) {
        this.report.put(date, bookName);
    }

    public void searchBookbyDate(LocalDate date) {
        report.containsKey(date);
        if (report.get(date) != null) {
            System.out.println(date + " - " + report.get(date));
        } else
            System.out.println(date + " - There are no taken books for this date");
    }

    public Collection<String> bookList() {
        return report.values();
    }


    public LocalDate firstDate() {
        return report.keySet().stream().min(LocalDate::compareTo).get();
    }

    public LocalDate lastDate() {
        return report.keySet().stream().max(LocalDate::compareTo).get();
    }

    public String dateRange() {
        return firstDate() + " - " + lastDate();
    }

    @Override
    public String toString() {
        return "Library report: \n" + report;
    }


}

