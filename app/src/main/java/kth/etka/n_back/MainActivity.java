package kth.etka.n_back;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttonPlay, buttonSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonPlay = findViewById(R.id.play);
        buttonPlay.setOnClickListener(this::play);

        buttonSettings = findViewById(R.id.settings);
        buttonSettings.setOnClickListener(this::settings);
    }

    private void settings(View view) {
        startActivity(new Intent(this, SettingsActivity.class));
    }
    private void play(View view) {
        startActivity(new Intent(this, PlayActivity.class));
    }

    private void loadFragment(Fragment fragment){
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.content_container, fragment);
        fragmentTransaction.commit();
    }
}
