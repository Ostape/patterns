package com.robosh;

import com.robosh.audio.AudioLanguage;
import com.robosh.subtitles.SubtitleLanguage;

public interface FilmFactory {
    AudioLanguage getAudioLanguage();
    SubtitleLanguage getSubtitleLanguage();
}
