/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        ArrayList<Word> familyList = new ArrayList<Word>();
        familyList.add(new Word("father","әpә",R.drawable.family_father,R.raw.family_father));
        familyList.add(new Word("mother", "әṭa",R.drawable.family_mother,R.raw.family_mother));
        familyList.add(new Word("son", "angsi",R.drawable.family_son,R.raw.family_son));
        familyList.add(new Word("daughter", "tune",R.drawable.family_daughter,R.raw.family_daughter));
        familyList.add(new Word("older brother", "taachi",R.drawable.family_older_brother,R.raw.family_older_brother));
        familyList.add(new Word("younger brother", "chalitti",R.drawable.family_younger_brother,R.raw.family_younger_brother));
        familyList.add(new Word("older sister", "teṭe",R.drawable.family_older_sister,R.raw.family_older_sister));
        familyList.add(new Word("younger sister", "kolliti",R.drawable.family_younger_sister,R.raw.family_younger_sister));
        familyList.add(new Word("grandmother ", "ama",R.drawable.family_grandmother,R.raw.family_grandmother));
        familyList.add(new Word("grandfather", "paapa",R.drawable.family_grandfather,R.raw.family_grandfather));

        ListView familyListView = (ListView)findViewById(R.id.list);

        WordAdapter adapter = new WordAdapter(this,familyList,R.color.category_family);
        familyListView.setAdapter(adapter);

        familyListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            MediaPlayer mediaPlayer;
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Word currentWord = (Word)adapterView.getItemAtPosition(position);
                mediaPlayer = MediaPlayer.create(FamilyActivity.this,currentWord.getMusicID());
                mediaPlayer.start();
            }
        });
    }
}
