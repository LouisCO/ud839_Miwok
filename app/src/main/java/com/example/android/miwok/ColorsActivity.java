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

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        ArrayList<Word> numbers=new ArrayList<>();
        numbers.add(new Word("red", "weṭeṭṭi"));
        numbers.add(new Word("green", "chokokki"));
        numbers.add(new Word("brown", "ṭakaakki"));
        numbers.add(new Word("gray", "ṭopoppi"));
        numbers.add(new Word("black", "kululli"));
        numbers.add(new Word("white", "kelelli"));
        numbers.add(new Word("dusty yellow", "ṭopiisә"));
        numbers.add(new Word("mustard yellow", "chiwiiṭә"));

        WordAdapter adapter=new WordAdapter(this, numbers);
        ListView listView=findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
