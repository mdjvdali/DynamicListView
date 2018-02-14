package com.ducat.assigmentconactlist;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText name,no;
    Button add,show;
    Intent i ;
    String n,nubmer, temp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    name=findViewById(R.id.name);
    no=findViewById(R.id.number);
    add=findViewById(R.id.addbutton);
    show=findViewById(R.id.showcontact);
    add.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            n=name.getText().toString();
            nubmer=no.getText().toString();
            if (n.equals(""))
            {
             name.setError("Enter name ");
            }
            if (nubmer.equals(""))
            {
                no.setError("Enter Number");
            }
            else {

                temp = " Name  \t\t  " + n + "\n Number\t\t" + nubmer;
                contactlist.addcontact(temp);
                Toast.makeText(MainActivity.this, "Contact Added ", Toast.LENGTH_SHORT).show();
                name.setText("");
                no.setText("");
            }
        }
    });

    show.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            i=new Intent(MainActivity.this,Main2Activity.class);
            startActivity(i);
        }
    });


    }
}
