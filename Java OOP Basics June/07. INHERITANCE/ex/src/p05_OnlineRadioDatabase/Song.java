package p05_OnlineRadioDatabase;

import p05_OnlineRadioDatabase.exceptions.InvalidSongLengthException;
import p05_OnlineRadioDatabase.exceptions.*;
import p05_OnlineRadioDatabase.exceptions.InvalidSongMinutesException;

class Song {
    private String artist;
    private String name;
    private int minutes;
    private int seconds;

    public Song(String artist, String name, String length) throws InvalidArtistException
            , InvalidSongNameException, InvalidSongLengthException {
        this.setArtist(artist);
        this.setName(name);
        this.setSongLength(length);
    }

    private void setSongLength(String length) throws InvalidSongLengthException {
        String[] tokens = length.split(":");
        if (tokens.length != 2) {
            throw new InvalidSongLengthException();
        }
        int minutes;
        int seconds;
        try {
            minutes = Integer.parseInt(tokens[0]);
            seconds = Integer.parseInt(tokens[1]);
        } catch (NumberFormatException ex) {
            throw new InvalidSongLengthException();
        }
        this.setMinutes(minutes);
        this.setSeconds(seconds);
    }

    private void setArtist(String artist) throws InvalidArtistException {
        if (artist.length() < 3 || artist.length() > 20) {
            throw new InvalidArtistException();
        }
        this.artist = artist;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) throws InvalidSongNameException {
        if (name.length() < 3 || name.length() > 30) {
            throw new InvalidSongNameException();
        }
        this.name = name;
    }

    public int getMinutes() {
        return minutes;
    }

    private void setMinutes(int minutes) throws InvalidSongMinutesException {
        if (minutes < 0 || minutes > 14) {
            throw new InvalidSongMinutesException();
        }
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    private void setSeconds(int seconds) throws InvalidSongSecondsException {
        if (seconds < 0 || seconds > 59) {
            throw new InvalidSongSecondsException();
        }
        this.seconds = seconds;
    }
}
