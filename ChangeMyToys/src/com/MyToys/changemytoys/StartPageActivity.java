package com.MyToys.changemytoys;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class StartPageActivity extends Activity {

	private ImageView my_splashItem = null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.start_page);
		
		my_splashItem = (ImageView)this.findViewById(R.id.splash_loading_item);
		
		initView();
		
	}

	protected void initView()
	{
		Animation translate = AnimationUtils.loadAnimation(this,
				R.anim.splash_loading);
		
		translate.setAnimationListener(new AnimationListener(){

			@Override
			public void onAnimationStart(Animation animation) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onAnimationEnd(Animation animation) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(StartPageActivity.this,HomeActivity.class);
				startActivity(intent);
				
				overridePendingTransition(R.anim.push_left_in,
						R.anim.push_left_out);
				StartPageActivity.this.finish();
			}

			@Override
			public void onAnimationRepeat(Animation animation) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		my_splashItem.setAnimation(translate);
	}
}
