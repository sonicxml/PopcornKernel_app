package sonicstudios.popcornkernel;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;


public class TweaksActivity extends Activity {
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);

	        TextView textview = new TextView(this);
	        textview.setText("This is the Tweaks tab");
	        setContentView(textview);
	    }
	}
