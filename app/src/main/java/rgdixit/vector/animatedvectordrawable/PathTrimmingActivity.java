package rgdixit.vector.animatedvectordrawable;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class PathTrimmingActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_path_trimming);
        findViewById(R.id.image_path_trimming).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        v.setSelected(!v.isSelected());
    }
}
