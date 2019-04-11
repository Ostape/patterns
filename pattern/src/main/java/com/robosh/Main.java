package com.robosh;

import com.robosh.audio.AudioLanguage;
import com.robosh.subtitles.SubtitleLanguage;

public class Main {
    public static void main(String[] args) {
        FilmFactory filmFactory = getFilmFactory("UA");

        SubtitleLanguage subtitle = filmFactory.getSubtitleLanguage();
        AudioLanguage audio = filmFactory.getAudioLanguage();

        subtitle.showSubtitleLanguage();
        audio.showAudioLanguage();

        filmFactory = getFilmFactory("RU");
        subtitle = filmFactory.getSubtitleLanguage();
        audio = filmFactory.getAudioLanguage();

        subtitle.showSubtitleLanguage();
        audio.showAudioLanguage();


    }

    private static FilmFactory getFilmFactory(String language){
        switch (language){
            case "UA":
                return new UkrainianFilmFactory();

            case "RU":
                return new RussianFilmFactory();

            case "ENG":
                return new EnglishFilmFactory();

            default:
                throw new RuntimeException("This fil don`t suppurt " + language + " language");
        }
    }
}
