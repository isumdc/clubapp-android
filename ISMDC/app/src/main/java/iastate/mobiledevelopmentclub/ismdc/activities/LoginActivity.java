package iastate.mobiledevelopmentclub.ismdc.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import iastate.mobiledevelopmentclub.ismdc.R;


public class LoginActivity extends Activity {

    Button button_login;
    EditText editText_username;
    EditText editText_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editText_username = (EditText) findViewById(R.id.edittext_email);
        editText_password = (EditText) findViewById(R.id.edittext_password);
        button_login = (Button) findViewById(R.id.button_login);
    }

    public void login(View view) {
        String username = editText_username.getText().toString().trim();
        String password = editText_password.getText().toString().trim();

        //TODO validate username and password strings
        //TODO connect to server

        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
        startActivity(intent);

    }

    public void signUp(View view) {
        //TODO
    }
}
