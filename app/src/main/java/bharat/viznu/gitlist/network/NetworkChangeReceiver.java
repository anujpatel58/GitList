package bharat.viznu.gitlist.network;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import bharat.viznu.gitlist.ApplicationController;
import bharat.viznu.gitlist.util.Helper;

public class NetworkChangeReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (Helper.getNetworkState(context)) {
            ApplicationController.getApplicationInstance().setIsNetworkConnected(true);
            Log.e("Network Receiver", "connected");
        } else {
            ApplicationController.getApplicationInstance().setIsNetworkConnected(false);
            Log.e("Network Receiver", "disconnected");
        }
    }
}