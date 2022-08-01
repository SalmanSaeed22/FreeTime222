package com.example.tests;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
public class ForgetPassword extends AppCompatActivity {
private ProgressBar progressBar ;
private FirebaseAuth firebaseAuth ;
private EditText passemail;
private Button send ;
    private TextView backB ;
@Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_forget_password);

    passemail = (EditText) findViewById(R.id.passemail);

    send = (Button) findViewById(R.id.send);

 backB = (TextView) findViewById(R.id.backB);


    progressBar = (ProgressBar) findViewById(R.id.progressBar);

    firebaseAuth = FirebaseAuth.getInstance();
    backB.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            finish();
        }
    });

    send.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            String email = passemail.getText().toString().trim();

            if (TextUtils.isEmpty(email)) {
                Toast.makeText(getApplication(), "Enter your registered email id", Toast.LENGTH_SHORT).show();
                return;
            }

            progressBar.setVisibility(View.VISIBLE);

            firebaseAuth.sendPasswordResetEmail(email)

                    .addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            if (task.isSuccessful()) {
                                Toast.makeText(ForgetPassword.this, "We have sent you instructions to reset your password!", Toast.LENGTH_SHORT).show();
                            } else {
                                Toast.makeText(ForgetPassword.this, "Failed to send reset email!", Toast.LENGTH_SHORT).show();
                            }

                            progressBar.setVisibility(View.GONE);
                        }
                    });
        }
    });backB.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            backB();
        }
    });


}
    //connect button with login
    private void backB() { Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
        finish();
    }


}





//define back button
    /*TextView backB = findViewById(R.id.backB);
        backB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backB();
            }
        });


    }
//connect button with login
    private void backB() { Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
        finish();
    }

    public void back(View view) { onBackPressed(); }
    public void sendResetPasswordEmail(View view) {

        EditText passemail = findViewById(R.id.passemail);
        String emailText = passemail.getText().toString();
        FirebaseAuth auth = FirebaseAuth.getInstance();
        auth.sendPasswordResetEmail(emailText).addOnCompleteListener(new  OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                if (task.isSuccessful())
                    Toast.makeText(ForgetPassword.this, "Emailsent", Toast.LENGTH_SHORT).show();
            }
        });

        }
    }*/
