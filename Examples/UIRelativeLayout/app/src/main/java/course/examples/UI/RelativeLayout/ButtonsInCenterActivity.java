package course.examples.UI.RelativeLayout;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by michal on 05/09/14.
 */
public class ButtonsInCenterActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buttons_in_center);
        getActionBar().setTitle(R.string.activity_buttons_in_center);
    }
}
