package fi.jamk.basicuicontrols;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AutoCompleteTextView();
    }

    public void AutoCompleteTextView() {
        AutoCompleteTextView actv = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView_login);
        ArrayAdapter<String> aa = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,
                new String[] {"Pasi", "Juha", "Kari", "Jouni", "Esa", "Hannu"});
        actv.setAdapter(aa);
    }

    public void onClickButtonLogin(View view) {
        AutoCompleteTextView log = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView_login);
        EditText pass = (EditText)findViewById(R.id.editText_pass);

        Toast.makeText(getApplicationContext(), log.getText() + " " + pass.getText(), Toast.LENGTH_LONG).show();
    }

}
