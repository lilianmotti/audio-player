package com.wordpress.liliangmader.musicplayer

import android.content.Context
import android.media.MediaPlayer

class AudioPlayer {


    companion object {
        var isPlaying:Boolean ?=null
        var audioRes:Int = R.raw.berimbau
        var mediaPlayer:MediaPlayer ?= null

        fun isAudioPlaying():Boolean?{
            return isPlaying
        }

        fun create(context: Context) {
            mediaPlayer = MediaPlayer.create(context, audioRes)
            isPlaying = true
            //return mediaPlayer!!
        }

        fun start() {
            mediaPlayer?.start()
        }



        fun pause() {
            mediaPlayer?.pause()
        }


        fun stop() {
            mediaPlayer?.stop()
            mediaPlayer?.release()
        }

    }
}