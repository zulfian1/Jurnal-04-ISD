package com.company;

public class PlayListLagu {
    private String songTitle;
    private String singer;

    public PlayListLagu(String songTitle, String singer){
        this.songTitle = songTitle;
        this.singer = singer;
    }

    public String getSongTitle() {
        return this.songTitle;
    }

    @Override
    public String toString() {
        return songTitle +" - "+ singer;
    }
}
