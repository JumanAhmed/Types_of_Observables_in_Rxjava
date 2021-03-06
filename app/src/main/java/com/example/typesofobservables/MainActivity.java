package com.example.typesofobservables;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ObservableAndObserver(View view) {
        startActivity(new Intent(getApplicationContext(), ObserverActivity.class));
    }

    public void SingleAndSingleObserver(View view) {
        startActivity(new Intent(getApplicationContext(), SingleObserveActivity.class));
    }

    public void MaybeAndMaybeObserver(View view) {
        startActivity(new Intent(getApplicationContext(), MaybeObserverActivity.class));
    }

    public void CompletableAndCompletableObserver(View view) {
        startActivity(new Intent(getApplicationContext(), CompletableObserverActivity.class));
    }

    public void FlowableAndObserver(View view) {
        startActivity(new Intent(getApplicationContext(), FlowableAndObserverActivity.class));
    }
}
