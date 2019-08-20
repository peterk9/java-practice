package com.company;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

class MovieLoader {

   static ArrayList<String> loadMovie(){
        ArrayList<String> movieList = new ArrayList<>();
        try {
            System.out.println(new File("").getAbsolutePath());
            File movieFile = new File("movie.txt");
            Scanner scanner = new Scanner(movieFile);

            while (scanner.hasNextLine()){
                movieList.add(scanner.nextLine());
            }

        } catch (Exception e){
            System.out.println("error: " + e.getLocalizedMessage());
        }

        return movieList;
    }

}