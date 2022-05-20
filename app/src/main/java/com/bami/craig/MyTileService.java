package com.bami.craig;


import android.os.Build;
import android.service.quicksettings.TileService;
import android.util.Log;

import androidx.annotation.RequiresApi;

@RequiresApi(api = Build.VERSION_CODES.N)
public class MyTileService extends TileService {

    boolean state = false;

    private final String TAG = "MyTileService";

    @Override
    public void onTileAdded() {
        Log.d(TAG, "onTileAdded");
    }

    @Override
    public void onTileRemoved() {
        Log.d(TAG, "onTileRemoved");
    }

    @Override
    public void onStartListening() {
        Log.d(TAG, "onStartListening");
    }

    @Override
    public void onStopListening() {
        Log.d(TAG, "onStopListening");
    }

    @Override
    public void onClick() {
        Log.d(TAG, "onClick: " + getQsTile().getState());
        if(!state) {
            getQsTile().setState(2);
            state = true;
        } else {
            getQsTile().setState(1);
            state = false;
        }

        getQsTile().updateTile();
    }
}
