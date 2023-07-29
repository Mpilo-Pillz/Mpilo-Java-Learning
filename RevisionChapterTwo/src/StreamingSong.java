public class StreamingSong {
    public static void main(String[] args) {
        Song song = new Song();

        song.artist = "Wun Two";
        song.title = "Snow";
        song.play();
        song.printDetails();
    }
}

class Song {
    String title;
    String artist;
    int duration;

    void play() {
        System.out.println("Playing song");
    }

    void printDetails() {
        System.out.println("This is " + title + " by " + artist);
    }
}
