package com.rajesh.myget;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);

		// set font from asset folder on this project

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

		// take id for hyperlinks to a textview

		TextView link1 = (TextView) findViewById(R.id.text1);
		TextView link2 = (TextView) findViewById(R.id.text2);
		TextView link3 = (TextView) findViewById(R.id.text3);
		TextView link4 = (TextView) findViewById(R.id.text4);
		TextView link5 = (TextView) findViewById(R.id.text5);
		TextView link6 = (TextView) findViewById(R.id.text6);
		TextView link7 = (TextView) findViewById(R.id.text7);
		TextView link8 = (TextView) findViewById(R.id.text8);
		TextView link9 = (TextView) findViewById(R.id.text9);
		TextView link10 = (TextView) findViewById(R.id.text10);
		TextView link11 = (TextView) findViewById(R.id.text11);
		TextView link12 = (TextView) findViewById(R.id.text12);
		TextView link13 = (TextView) findViewById(R.id.text13);

		// take id for hyper link to button

		Button btnosx = (Button) findViewById(R.id.bosx);
		Button btnwin = (Button) findViewById(R.id.bwin);
		Button btnlin = (Button) findViewById(R.id.blin);

		// set font face and bold and italic

		tv1.setTypeface(font, Typeface.BOLD_ITALIC);
		tv2.setTypeface(font, Typeface.BOLD_ITALIC);
		tv3.setTypeface(font, Typeface.BOLD_ITALIC);
		tv4.setTypeface(font, Typeface.BOLD_ITALIC);
		tv5.setTypeface(font, Typeface.BOLD_ITALIC);
		tv6.setTypeface(font, Typeface.BOLD_ITALIC);
		tv7.setTypeface(font, Typeface.BOLD_ITALIC);
		tv8.setTypeface(font, Typeface.BOLD_ITALIC);
		tv9.setTypeface(font, Typeface.BOLD_ITALIC);
		tv10.setTypeface(font, Typeface.BOLD_ITALIC);
		tv11.setTypeface(font, Typeface.BOLD_ITALIC);
		tv12.setTypeface(font, Typeface.BOLD_ITALIC);
		tv13.setTypeface(font, Typeface.BOLD_ITALIC);

		// when click on button go to browser

		btnosx.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

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

				Intent myWebLink = new Intent(
						android.content.Intent.ACTION_VIEW);
				myWebLink.setData(Uri.parse("http://msysgit.github.io/"));
				startActivity(myWebLink);
			}
		});

		btnlin.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent myWebLink = new Intent(
						android.content.Intent.ACTION_VIEW);
				myWebLink.setData(Uri
						.parse("http://git-scm.com/download/linux"));
				startActivity(myWebLink);
			}
		});

		// when click on text view go to browser

		String value1 = "<html><a href=\"http://gitx.laullon.com\">GitX (L) (OSX, open source)</a></html>";

		link1.setText(Html.fromHtml(value1));
		link1.setMovementMethod(LinkMovementMethod.getInstance());

		String value2 = "<html><a href=\"http://www.git-tower.com\">Tower (OSX)</a></html>";

		link2.setText(Html.fromHtml(value2));
		link2.setMovementMethod(LinkMovementMethod.getInstance());

		String value3 = "<html><a href=\"http://www.sourcetreeapp.com\">Source Tree (OSX &amp; Windows, free)</a></html>";

		link3.setText(Html.fromHtml(value3));
		link3.setMovementMethod(LinkMovementMethod.getInstance());

		String value4 = "<html><a href=\"https://mac.github.com\">GitHub for Mac (OSX, free)</a></html>";

		link4.setText(Html.fromHtml(value4));
		link4.setMovementMethod(LinkMovementMethod.getInstance());

		String value5 = "<html><a href=\"https://itunes.apple.com/gb/app/gitbox/id403388357?mt=12\">GitBox (OSX, App Store)</a></html>";

		link5.setText(Html.fromHtml(value5));
		link5.setMovementMethod(LinkMovementMethod.getInstance());

		String value6 = "<html><a href=\"http://git-scm.com/book\">Git Community Book</a></html>";

		link6.setText(Html.fromHtml(value6));
		link6.setMovementMethod(LinkMovementMethod.getInstance());

		String value7 = "<html><a href=\"http://progit.org/book\">Pro Git</a></html>";

		link7.setText(Html.fromHtml(value7));
		link7.setMovementMethod(LinkMovementMethod.getInstance());

		String value8 = "<html><a href=\"http://think-like-a-git.net\">Think like a git</a></html>";

		link8.setText(Html.fromHtml(value8));
		link8.setMovementMethod(LinkMovementMethod.getInstance());

		String value9 = "<html><a href=\"https://help.github.com\">GitHub Help</a></html>";

		link9.setText(Html.fromHtml(value9));
		link9.setMovementMethod(LinkMovementMethod.getInstance());

		String value10 = "<html><a href=\"http://marklodato.github.io/visual-git-guide/index-en.html\">A Visual Git Guide</a></html>";

		link10.setText(Html.fromHtml(value10));
		link10.setMovementMethod(LinkMovementMethod.getInstance());

		String value11 = "<html><a href=\"https://groups.google.com/forum/#!forum/git-users\">Git User Mailing List</a></html>";

		link11.setText(Html.fromHtml(value11));
		link11.setMovementMethod(LinkMovementMethod.getInstance());

		String value12 = "<html><a href=\"http://jk.gs/git\">#git on irc.freenode.net</a></html>";

		link12.setText(Html.fromHtml(value12));
		link12.setMovementMethod(LinkMovementMethod.getInstance());

		String value13 = "<html><a href=\"http://rogerdudler.github.io/git-guide\">http://rogerdudler.github.io/git-guide/</a></html>";

		link13.setText(Html.fromHtml(value13));
		link13.setMovementMethod(LinkMovementMethod.getInstance());

	}
}
