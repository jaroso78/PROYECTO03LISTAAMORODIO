package com.example.porque;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {
	
	static final Inf inf=new Inf();
	static final Sup sup= new Sup();
	
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//Manejamos los diferentes fragmentos añadiendolos dinámicamente
		FragmentManager fragmentManager= getFragmentManager();
		FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
		fragmentTransaction.add(R.id.inf, inf);
		fragmentTransaction.add(R.id.sup, sup);
		fragmentTransaction.commit();
		
	}
	
	//Capturamos el item seleccionado y lo pasamos a un método de inf
	// para que lo pueda escribir en el textView
	protected void itemSeleccionado (String item){
		inf.setItemSeleccionado(item);
	}
}
