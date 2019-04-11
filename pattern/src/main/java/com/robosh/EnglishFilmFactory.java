package com.robosh;

import com.robosh.audio.AudioEnglish;
import com.robosh.audio.AudioLanguage;
import com.robosh.subtitles.SubtitleEnglish;
import com.robosh.subtitles.SubtitleLanguage;

public class EnglishFilmFactory implements FilmFactory {
    public AudioLanguage getAudioLanguage() {
        return new AudioEnglish();
    }

    public SubtitleLanguage getSubtitleLanguage() {
        return new SubtitleEnglish();
    }
}
