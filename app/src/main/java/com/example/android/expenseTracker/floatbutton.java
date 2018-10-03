package com.example.android.expenseTracker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class floatbutton extends AppCompatActivity {
    private TextView mIncome;
    private TextView mExpense;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editor);

        // Find all relevant views that we will need to read user input from
        mIncome = (TextView) findViewById(R.id.income);
        mExpense = (TextView) findViewById(R.id.expense);
        mIncome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(floatbutton.this, EditorActivity.class);
                startActivity(intent);
            }
        });



    }
}
