package com.example.anhhong.myapplication;


        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.util.Log;
        import android.widget.Button;
        import android.media.MediaPlayer;
        import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);



        Button btn1 = (Button) this.findViewById(R.id.BtnPlaySound1);
        final MediaPlayer mp1 = MediaPlayer.create(this, R.raw.soho);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp1.start();

            }
        });
    }
}
