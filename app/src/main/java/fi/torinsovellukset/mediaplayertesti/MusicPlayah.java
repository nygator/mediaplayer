package fi.torinsovellukset.mediaplayertesti;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;

public class MusicPlayah {
    private MediaPlayer mediaPlayer = new MediaPlayer();

    public void PlaySomeMusic(String url, int i){

        if (i == 0) {
            mediaPlayer.setAudioAttributes(
                    new AudioAttributes.Builder()
                            .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                            .setUsage(AudioAttributes.USAGE_MEDIA)
                            .build()
            );
        } else {
            mediaPlayer.reset();
        }
        try{
            mediaPlayer.setDataSource(url);
            mediaPlayer.prepare();
            mediaPlayer.start();
        } catch (Exception e){
            System.out.println(e);
        }
    }
    public void StopHumppa(){
        mediaPlayer.stop();
    }
}
