package es.carballeira.gestordeberes;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        /**
         * RecyclerView
         */
        ArrayList<Trabajo> trabajoArrayList = new ArrayList<>();

        TrabajoAdapter trabajoAdapter = new TrabajoAdapter(trabajoArrayList);

        RecyclerView rvDeberes = findViewById(R.id.rv_deberes);

        rvDeberes.setLayoutManager(new LinearLayoutManager(this));

        rvDeberes.setAdapter(trabajoAdapter);


        /**
         * Float Action Button
         */
        FloatingActionButton fbaAdd = findViewById(R.id.fab_add);

        fbaAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        /**
         * Dialogo
         */



    }
}