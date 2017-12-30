/*
 * Copyright (c) 2017. This Project is under Copyright and cannot be used. However the components are available under the MIT and GPL License on GitHub/vedantkarandikar
 */

package ml.vkdev.guider.guider;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.transition.Fade;
import android.view.View;

import com.ramotion.foldingcell.FoldingCell;

public class chooser extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.guide_chooser);
        setupWindowAnimations();
        final FoldingCell fc = findViewById(R.id.folding_cell);
        fc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fc.toggle(false);
            }
        });
        findViewById(R.id.button_run_go).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), runintro.class);
                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(chooser.this);

                startActivity(intent, options.toBundle());
                startActivity(intent);
            }
        });

    }

    private void setupWindowAnimations() {
        Fade fade = new Fade();
        fade.setDuration(1000);
        getWindow().setEnterTransition(fade);
    }
}
