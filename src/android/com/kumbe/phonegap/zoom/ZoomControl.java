package com.kumbe.phonegap.zoom;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.LOG;
import org.json.JSONArray;
import org.json.JSONException;

import android.webkit.WebSettings.ZoomDensity;
import android.webkit.WebView;

/**
 * This class echoes a string called from JavaScript.
 */
public class ZoomControl extends CordovaPlugin {
	@Override
	public boolean execute(String action, final JSONArray args,
			final CallbackContext callbackContext) throws JSONException {
		
        if ("ZoomControl".equals(action)) {
        	        	
        	final WebView webView = this.webView;
        	
            cordova.getActivity().runOnUiThread(new Runnable() {

				public void run() {

                	try {

                		boolean enabled=args.getBoolean(0);
                		
            			LOG.d("SetZoomControl", "executing SetZoomControl");

            			webView.getSettings().setBuiltInZoomControls(enabled);
            			webView.getSettings().setDefaultZoom(ZoomDensity.MEDIUM);
            			webView.getSettings().setSupportZoom(enabled);
            			callbackContext.success("OK");

            		} catch (Exception e) {
            			LOG.e("SetZoomControl", "Error: " + e.getMessage());
            			callbackContext.error("Error: " + e.getMessage());

            		}
            		
                }
            });
            return true;
        }
        return false;
        
	}
}
