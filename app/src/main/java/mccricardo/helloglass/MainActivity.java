package mccricardo.helloglass;

/**
 * Created by mccricardo.
 */
import com.google.android.glass.app.Card;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Card card1 = new Card(this);
        // Main text area
        card1.setText("Hello, Glass!");
        View card1View = card1.getView();

        // Display the card we just created
        setContentView(card1View);
    }

}