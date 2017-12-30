package ml.vkdev.guider.guider;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.transition.Fade;
import android.transition.Slide;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setEnterTransition();
        setExitTransition();
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), chooser.class);
                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(MainActivity.this);

                startActivity(intent, options.toBundle());
            }
        });
    }

    private void setEnterTransition() {

        Fade fade_transition = new Fade();
        fade_transition.setDuration(1000);
        getWindow().setEnterTransition(fade_transition);
    }

    private void setExitTransition() {

        Slide slide_transition = new Slide();
        slide_transition.setDuration(1000);
        getWindow().setExitTransition(slide_transition);
    }
}