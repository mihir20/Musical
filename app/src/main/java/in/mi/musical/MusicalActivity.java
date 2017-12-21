package in.mi.musical;

import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MusicalActivity extends AppCompatActivity {


    private int s1, s2, s3, s4, s5, s6, s7, s8, s9;
    private SoundPool soundPool;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_musical );

        soundPool = new SoundPool( 2, AudioManager.STREAM_MUSIC,0 );

        s1 = soundPool.load( getApplicationContext(),R.raw.sound1,1 );
        s2 = soundPool.load( getApplicationContext(),R.raw.sound2,1 );
        s3 = soundPool.load( getApplicationContext(),R.raw.sound3,1 );
        s4 = soundPool.load( getApplicationContext(),R.raw.sound4,1 );
        s5 = soundPool.load( getApplicationContext(),R.raw.sound5,1 );
        s6 = soundPool.load( getApplicationContext(),R.raw.sound6,1 );
        s7 = soundPool.load( getApplicationContext(),R.raw.sound7,1 );
        s8 = soundPool.load( getApplicationContext(),R.raw.sound8,1 );
        s9 = soundPool.load( getApplicationContext(),R.raw.sound9,1 );

    }

    public void play1(View view) {
        soundPool.play( s1,1.0f,1.0f,0,0,1.0f );
    }


    public void play2(View view) {
        soundPool.play( s2,1.0f,1.0f,0,0,1.0f );
    }


    public void play3(View view){
        soundPool.play( s3,1.0f,1.0f,0,0,1.0f );
    }


    public void play4(View view) {
        soundPool.play( s4,1.0f,1.0f,0,0,1.0f );
    }


    public void play5(View view) {
        soundPool.play( s5,1.0f,1.0f,0,0,1.0f );
    }


    public void play6(View view) {
        soundPool.play( s6,1.0f,1.0f,0,0,1.0f );
    }


    public void play7(View view) {
        soundPool.play( s7,1.0f,1.0f,0,0,1.0f );
    }


    public void play8(View view) {
        soundPool.play( s8,1.0f,1.0f,0,0,1.0f );
    }


    public void play9(View view) {
        soundPool.play( s9,1.0f,1.0f,0,0,1.0f );
    }
}
