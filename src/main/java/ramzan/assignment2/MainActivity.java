package ramzan.assignment2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void  buttonClick(View v)
    {
        EditText editText=(EditText)findViewById(R.id.edttext);
        TextView txtview=(TextView)findViewById(R.id.txtview);
        String word=editText.getText().toString();
        txtview.setText(word);
    }
}
