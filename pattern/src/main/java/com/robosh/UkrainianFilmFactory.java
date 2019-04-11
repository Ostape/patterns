package com.robosh;

import com.robosh.audio.AudioLanguage;
import com.robosh.audio.AudioUkrainian;
import com.robosh.subtitles.SubtitleLanguage;
import com.robosh.subtitles.SubtitleUkrainian;

public class UkrainianFilmFactory implements FilmFactory {
    public AudioLanguage getAudioLanguage() {
        return new AudioUkrainian();
    }

    public SubtitleLanguage getSubtitleLanguage() {
        return new SubtitleUkrainian();
    }
}
