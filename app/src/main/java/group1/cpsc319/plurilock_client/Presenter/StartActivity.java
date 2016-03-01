package group1.cpsc319.plurilock_client.Presenter;

import group1.cpsc319.plurilock_client.Model.User;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import group1.cpsc319.plurilock_client.R;


public class StartActivity extends GestureCompatActivity {
    private User test;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        test = new User("Matas", "matas@alumni.ubc.ca");
        tv = (TextView) findViewById(R.id.text_view_1);
        tv.setText(test.userMessage());

        final Button button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tv = (TextView) findViewById(R.id.text_view_1);
                tv.setText("You clicked the button!");
            }
        });
    }
}
