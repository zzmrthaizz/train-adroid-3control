package com.example.train_adroid_3control;

import android.os.Bundle;
import android.R.integer;
import android.app.Activity;
import android.text.Editable;
import android.view.Menu;
import android.view.TextureView;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		final TextView ketqua = (TextView) findViewById(R.id.ketqua);
		

		
		
		Button cong = (Button) findViewById(R.id.cong);
		Button tru = (Button) findViewById(R.id.tru);
		Button nhan = (Button) findViewById(R.id.nhan);
		Button chia = (Button) findViewById(R.id.chia);
		
		cong.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				EditText a = (EditText) findViewById(R.id.edita);
				int soa = Integer.parseInt(a.getText()+"");
				EditText b = (EditText) findViewById(R.id.editb);
				int sob = Integer.parseInt(b.getText()+"");
							
				ketqua.setText (soa + "+"+sob+"="+(sob+soa)+"");
				
			}
		});
		tru.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				EditText a = (EditText) findViewById(R.id.edita);
				int soa = Integer.parseInt(a.getText()+"");
				EditText b = (EditText) findViewById(R.id.editb);
				int sob = Integer.parseInt(b.getText()+"");
				ketqua.setText(soa + "-"+sob+"="+(soa-sob));
				
			}
		});
		nhan.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				EditText a = (EditText) findViewById(R.id.edita);
				int soa = Integer.parseInt(a.getText()+"");
				EditText b = (EditText) findViewById(R.id.editb);
				int sob = Integer.parseInt(b.getText()+"");
				ketqua.setText(soa + "*"+sob+"="+(soa*sob));
				
			}
		});	
		chia.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				EditText a = (EditText) findViewById(R.id.edita);
				int soa = Integer.parseInt(a.getText()+"");
				EditText b = (EditText) findViewById(R.id.editb);
				int sob = Integer.parseInt(b.getText()+"");
				ketqua.setText(soa + "/"+sob+"="+(soa/sob));
				
			}
		});		
	}
	
	
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
