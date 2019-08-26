package com.wordpress.liliangmader.musicplayer

import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.view.View.OnClickListener
import android.widget.MediaController
import android.view.View
import java.security.AccessController.getContext

class MainActivity : AppCompatActivity() {

   // private var mediaPlayer: MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //initiates media player
       //  mediaPlayer = MediaPlayer.create(this, R.raw.berimbau)
       // mediaPlayer =
                AudioPlayer.create(this)

        val playButton = findViewById<View>(R.id.button_play) as Button
        playButton.setOnClickListener {
           // if (AudioPlayer.isAudioPlaying()!=true){
             //   mediaPlayer!!.start()
                AudioPlayer.start()
           // }
        }

        val pauseButton = findViewById<View>(R.id.button_pause) as Button
        pauseButton.setOnClickListener {
           // mediaPlayer!!.pause()
            AudioPlayer.pause()
        }

      //  val restartButton = findViewById<View>(R.id.button_restart) as Button
      //  restartButton.setOnClickListener { mediaPlayer!!.seekTo(0) }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_play -> {
                AudioPlayer.start()
                 true
            }
            R.id.action_pause-> {
               AudioPlayer.pause()
                true
            }
           else -> super.onOptionsItemSelected(item)
        }
    }

}
