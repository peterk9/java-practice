package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // choose random movie
        // output '-' for length of movie
        // while num wins != 3 loop movie option (outer loop)
        // inner loop show movie, but if they pick the right letter, then show letter instead of _

        ArrayList<String> moveList = MovieLoader.loadMovie();
        Game game = new Game(moveList);
        game.play();
    }
}


