package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class Game {

    private ArrayList<String> randomMovies;

    private int games = 3;
    private int tries = 15;
    private int wins = 0;

    Game(ArrayList<String> moveList){

        // setup
        ArrayList<String> randomMovies = new ArrayList<>();
        for(int i = 0; i < this.games; i++){
            int random = (int) (Math.random() * moveList.size());
            randomMovies.add(moveList.remove(random));
        }

        this.randomMovies = randomMovies;
    }

    void play(){

        while (wins != games && tries > 0){

            StringBuilder movie = new StringBuilder(this.randomMovies.get(wins));
            StringBuilder hidden = new StringBuilder(this.randomMovies.get(wins).replaceAll("[a-z]", "-"));

            HashMap<Character, ArrayList<Integer>> wordCount = new HashMap<>();

            for (int i = 0; i < movie.length(); i++){
                Character c = movie.charAt(i);
                if(!c.equals(' ')) {
                    ArrayList<Integer> count;

                    if(wordCount.get(c) != null)
                        count = wordCount.get(c);
                    else
                        count = new ArrayList<>();

                    count.add(i);
                    wordCount.put(c, count);
                }
            }

            boolean nextGame = false;

            while(tries > 0 && !nextGame)  {
                System.out.println(hidden);
                System.out.println("number of tries: " + tries);
                System.out.println("Enter next guess: ");
                Scanner scanner = new Scanner(System.in);
                Character character = scanner.next().toCharArray()[0];

                if (wordCount.get(character) != null) {
                    System.out.println("hit! " + wordCount.get(character).size());
                    ArrayList<Integer> hits = wordCount.get(character);

                    for (int hitIndex : hits) {
                        hidden.replace(hitIndex, hitIndex + 1, movie.substring(hitIndex, hitIndex + 1));
                    }
                } else {
                    this.tries--;
                }


                if (hidden.toString().equals(movie.toString()) || tries == 0) {
                    System.out.println("you guessed! " + hidden);
                    System.out.println("movie was " + movie);
                    System.out.println("current wins " + this.wins);
                    System.out.println("games left " + this.games);
                    ++this.wins;
                    nextGame = true;
                }

            }

        }

        if(this.tries == 0) System.out.println("You lost try again");
        if(this.wins == this.games) System.out.println("You won!");

    }
}
