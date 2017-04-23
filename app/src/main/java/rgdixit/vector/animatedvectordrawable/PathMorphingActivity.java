package rgdixit.vector.animatedvectordrawable;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class PathMorphingActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_path_morphing);
        ImageView imageView = (ImageView) findViewById(R.id.image_path_morphing);
        imageView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        v.setSelected(!v.isSelected());
    }
}
