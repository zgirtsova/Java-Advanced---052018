package p05_OnlineRadioDatabase.exceptions;

public class InvalidArtistException extends InvalidSongException {
    public InvalidArtistException() {
        super("Artist name should be between 3 and 20 symbols.");
    }
}
