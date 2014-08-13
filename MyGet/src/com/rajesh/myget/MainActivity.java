package com.rajesh.myget;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Typeface font = Typeface.createFromAsset(getAssets(),
				"FantasqueSansMono-Regular.ttf");

		TextView tv1 = (TextView) findViewById(R.id.tvtitle1);
		TextView tv2 = (TextView) findViewById(R.id.tvtitle2);
		TextView tv3 = (TextView) findViewById(R.id.tvtitle3);
		TextView tv4 = (TextView) findViewById(R.id.tvtitle4);
		TextView tv5 = (TextView) findViewById(R.id.tvtitle5);
		TextView tv6 = (TextView) findViewById(R.id.tvtitle6);
		TextView tv7 = (TextView) findViewById(R.id.tvtitle7);
		TextView tv8 = (TextView) findViewById(R.id.tvtitle8);
		TextView tv9 = (TextView) findViewById(R.id.tvtitle9);
		TextView tv10 = (TextView) findViewById(R.id.tvtitle10);
		TextView tv11 = (TextView) findViewById(R.id.tvtitle11);
		TextView tv12 = (TextView) findViewById(R.id.tvtitle12);
		TextView tv13 = (TextView) findViewById(R.id.tvtitle13);
		Button btnosx = (Button) findViewById(R.id.bosx);
		Button btnwin = (Button) findViewById(R.id.bwin);
		Button btnlin = (Button) findViewById(R.id.blin);
		Button bt1 = (Button) findViewById(R.id.b1);
		Button bt2 = (Button) findViewById(R.id.b2);
		Button bt3 = (Button) findViewById(R.id.b3);
		Button bt4 = (Button) findViewById(R.id.b4);
		Button bt5 = (Button) findViewById(R.id.b5);
		Button bt6 = (Button) findViewById(R.id.b6);
		Button bt7 = (Button) findViewById(R.id.b7);
		Button bt8 = (Button) findViewById(R.id.b8);
		Button bt9 = (Button) findViewById(R.id.b9);
		Button bt10 = (Button) findViewById(R.id.b10);
		Button bt11 = (Button) findViewById(R.id.b11);
		Button bt12 = (Button) findViewById(R.id.b12);
		Button bt13 = (Button) findViewById(R.id.b13);
		

		tv1.setTypeface(font);
		tv2.setTypeface(font);
		tv3.setTypeface(font);
		tv4.setTypeface(font);
		tv5.setTypeface(font);
		tv6.setTypeface(font);
		tv7.setTypeface(font);
		tv8.setTypeface(font);
		tv9.setTypeface(font);
		tv10.setTypeface(font);
		tv11.setTypeface(font);
		tv12.setTypeface(font);
		tv13.setTypeface(font);

		btnosx.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myWebLink = new Intent(
						android.content.Intent.ACTION_VIEW);
				myWebLink.setData(Uri
						.parse("https://code.google.com/p/git-osx-installer/downloads/list?can=3"));
				startActivity(myWebLink);
			}
		});
		btnwin.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myWebLink = new Intent(
						android.content.Intent.ACTION_VIEW);
				myWebLink.setData(Uri
						.parse("http://msysgit.github.io/"));
				startActivity(myWebLink);
			}
		});
		btnlin.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myWebLink = new Intent(
						android.content.Intent.ACTION_VIEW);
				myWebLink.setData(Uri
						.parse("http://git-scm.com/download/linux"));
				startActivity(myWebLink);
			}
		});
		bt1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myWebLink = new Intent(
						android.content.Intent.ACTION_VIEW);
				myWebLink.setData(Uri
						.parse("http://gitx.laullon.com/"));
				startActivity(myWebLink);
			}
		});
		bt2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myWebLink = new Intent(
						android.content.Intent.ACTION_VIEW);
				myWebLink.setData(Uri
						.parse("http://www.git-tower.com/"));
				startActivity(myWebLink);
			}
		});
		bt3.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myWebLink = new Intent(
						android.content.Intent.ACTION_VIEW);
				myWebLink.setData(Uri
						.parse("http://www.sourcetreeapp.com/"));
				startActivity(myWebLink);
			}
		});
		bt4.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myWebLink = new Intent(
						android.content.Intent.ACTION_VIEW);
				myWebLink.setData(Uri
						.parse("https://mac.github.com/"));
				startActivity(myWebLink);
			}
		});
		bt5.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myWebLink = new Intent(
						android.content.Intent.ACTION_VIEW);
				myWebLink.setData(Uri
						.parse("https://itunes.apple.com/gb/app/gitbox/id403388357?mt=12"));
				startActivity(myWebLink);
			}
		});
		bt6.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myWebLink = new Intent(
						android.content.Intent.ACTION_VIEW);
				myWebLink.setData(Uri
						.parse("http://git-scm.com/book"));
				startActivity(myWebLink);
			}
		});
		bt7.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myWebLink = new Intent(
						android.content.Intent.ACTION_VIEW);
				myWebLink.setData(Uri
						.parse("http://progit.org/book/"));
				startActivity(myWebLink);
			}
		});
		bt8.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myWebLink = new Intent(
						android.content.Intent.ACTION_VIEW);
				myWebLink.setData(Uri
						.parse("http://think-like-a-git.net/"));
				startActivity(myWebLink);
			}
		});
		bt9.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myWebLink = new Intent(
						android.content.Intent.ACTION_VIEW);
				myWebLink.setData(Uri
						.parse("https://help.github.com/"));
				startActivity(myWebLink);
			}
		});
		bt10.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myWebLink = new Intent(
						android.content.Intent.ACTION_VIEW);
				myWebLink.setData(Uri
						.parse("http://marklodato.github.io/visual-git-guide/index-en.html"));
				startActivity(myWebLink);
			}
		});
		bt11.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myWebLink = new Intent(
						android.content.Intent.ACTION_VIEW);
				myWebLink.setData(Uri
						.parse("https://groups.google.com/forum/#!forum/git-users"));
				startActivity(myWebLink);
			}
		});
		bt12.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myWebLink = new Intent(
						android.content.Intent.ACTION_VIEW);
				myWebLink.setData(Uri
						.parse("http://jk.gs/git/"));
				startActivity(myWebLink);
			}
		});
		bt13.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myWebLink = new Intent(
						android.content.Intent.ACTION_VIEW);
				myWebLink.setData(Uri
						.parse("http://rogerdudler.github.io/git-guide/"));
				startActivity(myWebLink);
			}
		});

	}
}
