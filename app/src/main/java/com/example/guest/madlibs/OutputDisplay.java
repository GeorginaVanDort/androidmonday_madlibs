package com.example.guest.madlibs;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import butterknife.Bind;
import butterknife.ButterKnife;


public class OutputDisplay extends AppCompatActivity {


    @Bind(R.id.staticTextDisplay1) TextView mStaticDislpay1;
    @Bind(R.id.staticTextDisplay2) TextView mStaticDislpay2;
    @Bind(R.id.staticTextDisplay3) TextView mStaticDislpay3;
    @Bind(R.id.outputTextDisplayAdj) TextView mOutputTextDisplayAdj;
    @Bind(R.id.outputTextDisplayVerb) TextView mOutputTextDisplayVerb;
    @Bind(R.id.outputTextDisplayNoun) TextView mOutputTextDisplayNoun;
    @Bind(R.id.outputTextDisplayPlural) TextView mOutputTextDisplayPlural;
    @Bind(R.id.outputTextDisplayCeleb) TextView mOutputTextDisplayCeleb;
    @Bind(R.id.outputTextDisplayName) TextView mOutputTextDisplayName;


    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.output_display);

        Intent intent = getIntent();
        String adjective = intent.getStringExtra("adjective");
        String name = intent.getStringExtra("name");
        String celebrity = intent.getStringExtra("celebrity");
        String verb = intent.getStringExtra("verb");
        String noun = intent.getStringExtra("noun");
        String pluralNoun = intent.getStringExtra("pluralNoun");

        ButterKnife.bind(this);

        mOutputTextDisplayName.setText(name);
        mOutputTextDisplayAdj.setText(adjective);
        mOutputTextDisplayCeleb.setText(celebrity);
        mOutputTextDisplayNoun.setText(noun);
        mOutputTextDisplayVerb.setText(verb);
        mOutputTextDisplayPlural.setText(pluralNoun);

    }



}
