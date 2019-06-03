package test.app.my.application.note.book.zakaria.note;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    EditText date, note;
    Button add;
    DatabaseHelper helper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        date = findViewById(R.id.editText);
        note = findViewById(R.id.editText2);
        add = findViewById(R.id.button);
        helper = new DatabaseHelper(this);
        add.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Note notes = new Note(note.getText().toString(), date.getText().toString());
                helper.insertNote(notes);
                finish();
            }
        });
    }


    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
