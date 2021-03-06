package com.zykj.yuliang.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import com.zykj.yuliang.BaseActivity;
import com.zykj.yuliang.R;
import com.zykj.yuliang.view.MyCommonTitle;

public class NewsListActivity extends BaseActivity {

	private MyCommonTitle myCommonTitle;
	private LinearLayout ll_news_id;
	private Intent intent;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_news_list);
		initViews();
		initClick();
		initEvents();
		
		
	}

	protected void initClick() {
		ll_news_id.setOnClickListener(this);
	}

	protected void initViews() {
		myCommonTitle = (MyCommonTitle) findViewById(R.id.aci_mytitle);
		myCommonTitle.setTitle("���Ź���");
		ll_news_id = (LinearLayout) findViewById(R.id.news_id);
	}

	protected void initEvents() {

	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.news_id:
			startActivity(new Intent(NewsListActivity.this,NewsContentActivity.class));
			break;
		default:
			break;
		}
		
	}

}


