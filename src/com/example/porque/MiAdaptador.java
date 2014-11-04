package com.example.porque;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MiAdaptador extends ArrayAdapter<String>{
	private final Context context;
	private final String[] values;
	
	//Constructor.
	public MiAdaptador (Context context, int resource, int textViewResourceId, 
			String[] objects){
		super(context, resource,textViewResourceId,objects);
		this.context = context;
		this.values = objects;
		
	}
	
	//Método que llama cada vez al ListView cuando se quiere dibujar un dato
	public View getView(int position,View convertView, ViewGroup parent){
		View rowView;
		if(convertView==null){
			LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			rowView = inflater.inflate(R.layout.listview_custom, parent,false);
		}else {
			rowView=convertView;
		}
		
		//Recogemos los views
		TextView textView = (TextView) rowView.findViewById(R.id.label);
		ImageView imageView =(ImageView) rowView.findViewById(R.id.icon);
		//pasamos el valor del texto
		textView.setText(values[position]);
		
		//lo almacenamos en un string en función del valor recogido.
		String s =values[position];
		
       //Si el string empieza por windows.		
		if (s.startsWith("Windows")){
			imageView.setImageResource(R.drawable.ic_launcher);
		} else if (s.startsWith("iPh") || s.startsWith("Ma")) { //Empiza por iPh o Ma
			imageView.setImageResource(R.drawable.corazon);
		} else { //Resto
			imageView.setImageResource(R.drawable.ic_launcher);
		}
		
		//Devolvemos el grupo a dibujar.
		return rowView; 
		
	}
	

}
