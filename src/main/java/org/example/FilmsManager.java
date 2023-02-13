package org.example;

public class FilmsManager {
    private int limit;

    public FilmsManager() {
        this.limit = 10;

    }

    public FilmsManager(int limit) {
        this.limit = limit;
    }

    private String[] films = new String[0];

    public void addFilm(String filmName) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = filmName;
        films = tmp;
    }

    public String[] findAll() {

        return films;
    }

    public String[] findLast() {
        int resultLength;
        if (films.length < 10) {
            resultLength = films.length;
        } else {
            resultLength = limit;
        }
        String[] tmp = new String[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;

    }
}