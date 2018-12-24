package com.denofdevelopers.www.blogmaterialdesignalertdialog;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    private void exitConfirmationDialogDisplay() {
        new AlertDialog.Builder(this).setMessage("Are you sure you want to exit?")
                .setPositiveButton("OK", (dialog, which) -> finish())
                .setNegativeButton("Cancel", (dialog, which) -> dialog.dismiss())
                .show();
    }

    @OnClick(R.id.exitButton)
    public void onExitClick() {
        exitConfirmationDialogDisplay();
    }
}
