package com.example.guest.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
   @Bind(R.id.madlibButton) Button mMadLibButton;
   @Bind(R.id.inputAdjective) EditText mInputAdjective;
   @Bind(R.id.inputCelebrity) EditText mInputCelebrity;
   @Bind(R.id.inputName) EditText mInputName;
   @Bind(R.id.inputNoun) EditText mInputNoun;
   @Bind(R.id.inputPluralNoun) EditText mInputPluralNoun;
   @Bind(R.id.inputVerb) EditText mInputVerb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        mMadLibButton.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                String adjective = mInputAdjective.getText().toString();
                String noun = mInputNoun.getText().toString();
                String pluralNoun = mInputPluralNoun.getText().toString();
                String verb = mInputVerb.getText().toString();
                String name = mInputName.getText().toString();
                String celebrity = mInputCelebrity.getText().toString();

                Intent intent = new Intent(MainActivity.this, OutputDisplay.class);

                intent.putExtra("name", name);
                intent.putExtra("celebrity", celebrity);
                intent.putExtra("verb", verb);
                intent.putExtra("noun", noun);
                intent.putExtra("adjective", adjective);
                intent.putExtra("pluralNoun", pluralNoun);

                startActivity(intent);
            }
        });

            }

    }

