package com.cemalettinaltintas.activitylifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.cemalettinaltintas.activitylifecycle.databinding.ActivityMain2Binding;
import com.cemalettinaltintas.activitylifecycle.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        System.out.println("onCreate running");
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("onStart running");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("onResume running");
    }
    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("onPause running");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("onStop running");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("onDestroy running");
    }
    public void sonrakiSayfa(View view){
        String kullaniciGirdisi=binding.editText.getText().toString();
        Intent intent=new Intent(MainActivity.this,MainActivity2.class);
        intent.putExtra("isim",kullaniciGirdisi);
        startActivity(intent);
    }
}