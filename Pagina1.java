package com.example.hhtest;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class Pagina1 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pagina1);
		View prue = findViewById(R.id.butPrue);
		prue.setOnClickListener(new OnClickListener(){
			
			public void onClick(View v)  {
				try{
					Intent i = new Intent(Pagina1.this, Pagina2.class);
			        startActivity(i);
				}catch (Exception e) {
					TextView error = (TextView) findViewById(R.id.TexWarn);	
					error.setText("No se aceptan letras \n Digite un numero");
					
				}
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.pagina1, menu);
		return true;
	}

}
