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


class Word {
    // Default translation for the word
    private String mDefaultTranslation;

    // Miwok translation for the word
    private String mMiwokTranslation;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in the user's language
     * @param miwokTranslation   is the word in Miwok
     */
    Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
    }

    // Get the default translation of the word.
    String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    // Get the Miwok translation of the word.
    String getMiwokTranslation() {
        return mMiwokTranslation;
    }
}
