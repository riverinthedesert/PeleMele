import android.widget.Button;
import android.widget.Toast;
import com.example.pelemele.MainActivity;

public class Ecouteur implements EventHandler<ActionEvent> {
    public Ecouteur() {
    }
    @Override
    public void handle(ActionEvent actionEvent) {
        Button bonjour = (Button) findViewById(R.id.bouton_bonjour);
        bonjour.setOnClickListener(v) ->{
            Toast.makeText(MainActivity.this, "Bonjour", Toast.LENGTH_SHORT).show();
            });
        }
    }
}