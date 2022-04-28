package fi.torinsovellukset.mediaplayertesti;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    int i = 0;
    int firstTime = 0;

    MusicPlayah musicPlayah = new MusicPlayah();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void playHumppa(View v){
        System.out.println(Integer.toString(i));
        if (i == 0){
            musicPlayah.PlaySomeMusic("http://stream.wappuradio.fi/icecast/wappuradio-legacy-streamer2.ogg", firstTime);
            firstTime = 1;
            i = 1;
        } else{
            i = 0;
            musicPlayah.StopHumppa();

        }

    }
}