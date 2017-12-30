package ml.vkdev.guider.guider;

import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

public class gtimerModel extends AppCompatActivity {
//ToDo: leftbutton, rightbutton, headingtext, detailtext, background, backgroundaudio,speakaudio.

    Button leftbutton;
    Button rightbutton;
    TextView headingtext;
    TextView detailtext;

    public Button getLeftbutton() {
        return leftbutton;
    }

    public void setLeftbutton(Button leftbutton) {
        this.leftbutton = leftbutton;
    }

    public Button getRightbutton() {
        return rightbutton;
    }

    public void setRightbutton(Button rightbutton) {
        this.rightbutton = rightbutton;
    }

    public TextView getDetailtext() {
        return detailtext;
    }

    public void setDetailtext(TextView detailtext) {
        this.detailtext = detailtext;
    }

    public TextView getHeadingtext() {
        return headingtext;
    }

    public void setHeadingtext(TextView headingtext) {
        this.headingtext = headingtext;
    }
}

