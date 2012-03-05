package sonicstudios.popcornkernel;

// import android.app.Activity;
// import android.content.res.Resources;
import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

/*public class startingPoint extends TabActivity {
	public void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
    	setContentView(R.layout.main);
    
//    	Resources res = getResources(); // Resource object to get Drawables
    	TabHost tabHost = getTabHost();  // The activity TabHost
    	TabHost.TabSpec spec;  // Resusable TabSpec for each tab
    	Intent intent;  // Reusable Intent for each tab

    	// Create an Intent to launch an Activity for the tab (to be reused)
    	intent = new Intent().setClass(this, CPUActivity.class);

    	// Initialize a TabSpec for each tab and add it to the TabHost
    	spec = tabHost.newTabSpec("CPU").setIndicator("CPU")
                  	.setContent(intent);
    	tabHost.addTab(spec);
    
    	// Do the same for the other tabs
    	intent = new Intent().setClass(this, TweaksActivity.class);
    	spec = tabHost.newTabSpec("Tweaks").setIndicator("Tweaks")
//    		res.getDrawable(R.drawable.ic_tab_albums))
                      .setContent(intent);
    	tabHost.addTab(spec);
    
    	intent = new Intent().setClass(this, DownloadsActivity.class);
    	spec = tabHost.newTabSpec("Download").setIndicator("Download")
//                      	res.getDrawable(R.drawable.ic_tab_songs))
                      .setContent(intent);
    	tabHost.addTab(spec);

    	intent = new Intent().setClass(this, AboutActivity.class);
    	spec = tabHost.newTabSpec("About").setIndicator("About")
//                      	res.getDrawable(R.drawable.ic_tab_songs))
                      .setContent(intent);
    	tabHost.addTab(spec);
    	
    	tabHost.setCurrentTab(1);
	}
}*/
public class startingPoint extends TabActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
    }
 }