package algonquin.cst2335.afnansAndroidLab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import algonquin.cst2335.ahmedsandroidlabs.R;

public class MainActivity extends AppCompatActivity {

    // static void main(String args[])
    @Override // This is the starting point:
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // do what the parent does

        // Loads the screen:
        setContentView(R.layout.activity_main);
    }
}