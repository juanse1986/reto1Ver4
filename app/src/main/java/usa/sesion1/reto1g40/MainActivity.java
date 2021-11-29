package usa.sesion1.reto1g40;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn1;
    TextView text1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = (Button) findViewById(R.id.btnComprar1);
        btn1.setOnClickListener(this);

        TextView text1 = (TextView) findViewById(R.id.btnComprar1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menuopciones, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.servicios){
            Toast.makeText(getApplicationContext(), "oprimio servicios", Toast.LENGTH_LONG).show();
        }
        if (id == R.id.sucursales){
            Toast.makeText(getApplicationContext(), "oprimio sucursales", Toast.LENGTH_LONG).show();
        }
        if (id == R.id.productos){
            Toast.makeText(getApplicationContext(), "oprimio productos", Toast.LENGTH_LONG).show();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        text1.setText("bienvenidos");
        Toast.makeText(getApplicationContext(), "oprimio un boton", Toast.LENGTH_LONG).show();
    }
}