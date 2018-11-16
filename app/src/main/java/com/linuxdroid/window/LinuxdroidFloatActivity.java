package com.linuxdroid.window;

import android.app.Activity;
import android.content.Intent;

/**
 * Simple activity which immediately launches {@link LinuxdroidFloatService} and exits.
 */
public class LinuxdroidFloatActivity extends Activity {

    @Override
    protected void onResume() {
        super.onResume();
        startService(new Intent(this, LinuxdroidFloatService.class));
        finish();
    }
}
