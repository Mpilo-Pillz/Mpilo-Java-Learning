package com.mpillz;
import com.mpillz.GuessGame;
import com.mpillz.TapeDeck;
import com.mpillz.DVDPlayer;
import com.mpillz.DrumKit;
import com.mpillz.Echo;

public class Main {

    public static void main(String[] args) {

//        GuessGame game = new GuessGame();
//        game.startGame();

//        DrumKit drumKit = new DrumKit();
//
//        drumKit.playSnare();
//        drumKit.snare = false;
//
//        if (drumKit.snare == true) {
//            drumKit.playSnare();
//        }
//
//        drumKit.playTopHat();
//
//        TapeDeck tapeDeck = new TapeDeck();
//        tapeDeck.canRecord = true;
//        tapeDeck.playTape();
//
//        if (tapeDeck.canRecord == true) {
//            tapeDeck.recordTape();
//        }
//
//        DVDPlayer dvdPlayer = new DVDPlayer();
//        dvdPlayer.canRecord = true;
//        dvdPlayer.playDVD();
//
//        if (dvdPlayer.canRecord == true) {
//            dvdPlayer.recordDVD();
//        }

        Echo e1 = new Echo();
        Echo e2 = new Echo();

        int x = 0;

        while (x < 4) {
            e1.hello();
//            e2.hello();
                e1.count = e1.count + 1;

            if (x == 3) {
                e2.count = e2.count + 1;
            }
            if (x == 4) {
              e2.count = e2.count + e1.count;
            }
            x = x + 1;
        }
        System.out.println(e2.count);
    }
}
