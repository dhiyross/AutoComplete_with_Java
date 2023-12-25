package com.example.autocomplete;

import androidx.appcompat.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements TextWatcher{
    TextView selection;
    AutoCompleteTextView edit;
    //membuat array untuk mengisi items pada layout
    String [] items ={"Rakha","Rossy","MarkLee","NakamotoYuta"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        selection = (TextView)findViewById(R.id.selection);
        edit = (AutoCompleteTextView)findViewById(R.id.autocomplete);
        edit.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,items));
        edit.addTextChangedListener(this);
    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2){
    edit.setText(edit.getText().toString());
    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3){
        edit.setText(edit.getText().toString());
    }

    @Override
    public void afterTextChanged(Editable editable){

    }
}