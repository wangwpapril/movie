package com.example.wwang.movie.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;

import com.example.wwang.movie.R;


/**
 * Splash screen activity is used to show splash . Here we use handler to show
 * splash for particular time and then disappear automatically.
 * 
 */
public class SplashActivity extends Activity {

	private static final String TAG = "SplashActivity";	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

		setContentView(R.layout.splash);

		this.initialize();
		Handler h = new Handler();
		h.postDelayed(new Runnable() {
			@Override
			public void run(){
				Intent mIntent = new Intent(SplashActivity.this,MainActivity.class);
				startActivity(mIntent);
//				SplashActivity.this.overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
				SplashActivity.this.finish();
			}
		},1000);
  
	}
	private void initialize(){
	
	}
}