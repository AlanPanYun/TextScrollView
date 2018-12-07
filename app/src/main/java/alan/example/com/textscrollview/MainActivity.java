package alan.example.com.textscrollview;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextScrollView view = findViewById(R.id.view);
        String drawText = view.getDrawText();
        ObjectAnimator an = ObjectAnimator.ofInt(view, "progress", 0, drawText.length());
        an.setStartDelay(1000);
        an.setDuration(2000);
        an.start();
    }
}
