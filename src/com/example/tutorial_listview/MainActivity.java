package com.example.tutorial_listview;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {
	
	//Declare a Listview variable to use for our list
	private ListView myList;
	
	//Declare an array of strings as our simple data source
    public static final String[] myData = {
    									"Warriors", 
    									"Knicks",
    									"Lakers", 
    									"Heat"
    							  };
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		//This call sets the main layout file for this activity
		setContentView(R.layout.activity_main);
		
		//Retrieve the ListView by its ID defined in the XML layout file
		myList = (ListView)findViewById(R.id.basic_list);
		
		//Define an ArrayAdapter to pass our data values in our String
		//array to the listview
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
		        android.R.layout.simple_list_item_1,
		        myData);
		
		//Set the adapter for the list to the one we just created
		myList.setAdapter(adapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
}
