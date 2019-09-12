package com.goxr3plus.streamplayer.application;

import com.goxr3plus.streamplayer.enums.Status;
import com.goxr3plus.streamplayer.stream.StreamPlayer;
import com.goxr3plus.streamplayer.stream.StreamPlayerEvent;
import com.goxr3plus.streamplayer.stream.StreamPlayerInterface;
import com.goxr3plus.streamplayer.stream.StreamPlayerListener;

import java.io.File;
import java.util.Map;

/**
 * @author GOXR3PLUS
 *
 */
public class AnotherDemoApplication  {

	private String audioFileName;

	private StreamPlayerInterface streamPlayer;
	private StreamPlayerListener listener;

	public AnotherDemoApplication(StreamPlayerInterface streamPlayer, String audioFileName) {
		this.audioFileName = audioFileName;
		this.streamPlayer = streamPlayer;
		this.listener = new AnotherStreamPlayerListener(audioFileName, streamPlayer);

	}


	public void start() {
		try {

			// Register to the Listeners
		 	streamPlayer.addStreamPlayerListener(listener);

			// Example
			File audioFile = new File(audioFileName);
			streamPlayer.open(audioFile);

			//Seek +x seconds starting from the current position
			streamPlayer.seekSeconds(15); // forward 15 seconds
			streamPlayer.seekSeconds(15); // forward 15 seconds again

			/* Seek starting from the begginning of the audio */
			//seekTo(200);

			// Play it
			streamPlayer.play();
			//pause();

		} catch (final Exception ex) {
			ex.printStackTrace();
		}
	}




	private String getExtension(String audioFileName) {
		return audioFileName.split("\\.(?=[^.]+$)")[1];
	}


//	public static void main(final String[] args) {
//		new AnotherDemoApplication();
//	}

}
