package com.MyToys.changemytoys;

import android.app.TabActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.TabHost;

public class HomeActivity extends TabActivity {
	
	private RadioGroup my_tabButtonGroup;
	private TabHost my_tabHost;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.activity_home);
	}
	
	

}
