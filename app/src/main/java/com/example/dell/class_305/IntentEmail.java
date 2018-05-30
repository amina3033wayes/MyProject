package com.example.dell.class_305;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class IntentEmail extends AppCompatActivity {
EditText to,subject,textMessage;
String receiptEmail,subjectString,textMessageString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_email);

        Initilize();
    }

    private void Initilize() {
    to = findViewById(R.id.ToText);
    subject = findViewById(R.id.SubjectText);
    textMessage= findViewById(R.id.TextText);

    }
    public void sendMail(View view){
        sendMail();
    }
    public void sendMail(){
        String receiptsEmail = to.getText().toString();
        String[] receiptlist = receiptsEmail.split(",");
        String subjectString = to.getText().toString();
        String textMessageString = to.getText().toString();

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL,receiptlist);
        intent.putExtra(Intent.EXTRA_SUBJECT,subjectString);
        intent.putExtra(Intent.EXTRA_TEXT,textMessageString);

        intent.setType("message/rfc822");
        startActivity(Intent.createChooser(intent,"Select an email client"));
    }
}
