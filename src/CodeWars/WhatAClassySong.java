package CodeWars;

/* 
Your job is to create a class called Song.
A new Song will take two parameters, title and artist.
Song mountMoose = new Song("Mount Moose", "The Snazzy Moose");

mountMoose.getTitle() => "Mount Moose";
mountMoose.getArtist() => "The Snazzy Moose";

You will also have to create an instance method named howMany() (or how_many()).

The method takes an array of people who have listened to the song that day. 
The output should be how many new listeners the song gained on that day out of 
all listeners. Names should be treated in a case-insensitive manner,
i.e. "John" is the same as "john".
Also if the same person listened to it more than once a day it should only count them once.
mountMoose.howMany(new ArrayList<String>(Arrays.asList("John", "Fred", "BOb", "carl", "RyAn"))); => 5
mountMoose.howMany(new ArrayList<String>(Arrays.asList("JoHn", "Luke", "AmAndA"))); => 2

 */
import java.util.*;

public class WhatAClassySong {

}

class Song {

    private String title;
    private String artist;
    private List<String> lista = new ArrayList<>();

    public Song(String title, String artist) {
        this.artist = artist;
        this.title = title;
    }

    public int howMany(ArrayList<String> listaIn) {

        int contadorNuevos = 0;
        for (String string : listaIn) {
            if (!lista.contains(string.toLowerCase())) {
                contadorNuevos++;
                lista.add(string.toLowerCase());
            }
            
        }
        return contadorNuevos;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public List<String> getLista() {
        return lista;
    }

    public void setLista(List<String> lista) {
        this.lista = lista;
    }

}
