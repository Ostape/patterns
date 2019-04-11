package com.robosh;

import com.robosh.audio.AudioLanguage;
import com.robosh.audio.AudioRussian;
import com.robosh.subtitles.SubtitleLanguage;
import com.robosh.subtitles.SubtitleRussian;

public class RussianFilmFactory implements FilmFactory{
    public AudioLanguage getAudioLanguage() {
        return new AudioRussian();
    }

    public SubtitleLanguage getSubtitleLanguage() {
        return new SubtitleRussian();
    }
}
