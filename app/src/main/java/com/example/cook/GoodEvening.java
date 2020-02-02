package com.example.cook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.hootsuite.nachos.NachoTextView;
import com.hootsuite.nachos.terminator.ChipTerminatorHandler;

import java.util.ArrayList;
import java.util.List;

public class GoodEvening extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_good_evening);
        iniComponent();
    }

    private void iniComponent() {

        NachoTextView et_tag = (NachoTextView) findViewById(R.id.et_tag);
        List<String> itemsStrings = new ArrayList<>();
        itemsStrings.add("5 ingredients or less");
        itemsStrings.add("dish");
        et_tag.setText(itemsStrings);
        et_tag.addChipTerminator('\n', ChipTerminatorHandler.BEHAVIOR_CHIPIFY_ALL);

    }

    public void chicken(View view) {

        CardView cardView = (CardView) findViewById(R.id.card_view);
        Intent intent = new Intent(this, Tacos.class);
        startActivity(intent);
    }
}
