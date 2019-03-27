package com.wordpress.liliangmader.musicplayer

import android.content.Context
import android.media.MediaPlayer

class AudioPlayer {


    companion object {
        var isPlaying:Boolean ?=null


        fun createPlayer(context: Context, audioRes: Int): MediaPlayer {
            val mediaPlayer = MediaPlayer.create(context, audioRes)
            isPlaying = true
            return mediaPlayer
        }


    }
}