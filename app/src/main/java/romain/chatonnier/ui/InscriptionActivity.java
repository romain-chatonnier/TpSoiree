package romain.chatonnier.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import romain.chatonnier.R;
import romain.chatonnier.beans.Etudiant;

public class InscriptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription);
        //récup du login
        //pas oublier getText() qui le transforme en char puis toString qui le transforme en String
        String login = ((TextView)findViewById(R.id.textInscriptionLogin)).getText().toString();

    }
