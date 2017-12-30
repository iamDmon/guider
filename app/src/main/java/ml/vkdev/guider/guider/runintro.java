/*
 * Copyright (c) 2017. This Project is under Copyright and cannot be used. However the components are available under the MIT and GPL License on GitHub/vedantkarandikar
 */

package ml.vkdev.guider.guider;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.transition.Fade;

import com.ramotion.paperonboarding.PaperOnboardingFragment;
import com.ramotion.paperonboarding.PaperOnboardingPage;
import com.ramotion.paperonboarding.listeners.PaperOnboardingOnRightOutListener;

import java.util.ArrayList;

public class runintro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.run_chooser);
        setupWindowAnimations();

        PaperOnboardingPage scr1 = new PaperOnboardingPage("Start",
                "Running is easy, Starting is tricky.",
                Color.parseColor("#29B6FC"), R.drawable.start, R.drawable.walk_small);
        PaperOnboardingPage scr2 = new PaperOnboardingPage("Faith",
                "Have faith in us, we will 'work out'",
                Color.parseColor("#66BB6A"), R.drawable.faith, R.drawable.walk_small);
        PaperOnboardingPage scr3 = new PaperOnboardingPage("Commit",
                "We have worked hard to put this together for you, reciprocate the favour. \n Commit to yourself to follow this guide",
                Color.parseColor("#AB47BC"), R.drawable.commit, R.drawable.walk_small);

        ArrayList<PaperOnboardingPage> elements = new ArrayList<>();
        elements.add(scr1);
        elements.add(scr2);
        elements.add(scr3);

        PaperOnboardingFragment onBoardingFragment = PaperOnboardingFragment.newInstance(elements);


        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.run_chooser_container, onBoardingFragment);
        fragmentTransaction.commit();

        onBoardingFragment.setOnRightOutListener(new PaperOnboardingOnRightOutListener() {
            @Override
            public void onRightOut() {

            }
        });
    }

    private void setupWindowAnimations() {
        Fade fade = new Fade();
        fade.setDuration(1000);
        getWindow().setEnterTransition(fade);
    }

}
