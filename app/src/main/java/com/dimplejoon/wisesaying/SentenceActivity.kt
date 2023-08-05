package com.dimplejoon.wisesaying

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class SentenceActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sentence)

        val sentenceList = mutableListOf<String>()

        sentenceList.add("住めば都")
        sentenceList.add("頭は隠して尻隠さず")
        sentenceList.add("後の祭り")
        sentenceList.add("石の上でも三年")
        sentenceList.add("石橋を叩いて渡る")
        sentenceList.add("馬の耳に念仏")
        sentenceList.add("鰯の頭も信心から")
        sentenceList.add("縁の下の力持ち")
        sentenceList.add("同じ釜の飯を食う")
        sentenceList.add("河童の川流れ")
        sentenceList.add("清水の舞台から飛び降りる")
        sentenceList.add("知らぬが仏")
        sentenceList.add("捕らぬ狸の皮算用")
        sentenceList.add("三人寄れば文殊の知恵")

        val sentenceAdapter = ListViewAdapter(sentenceList)
        val listview = findViewById<ListView>(R.id.sentenceListView)

        listview.adapter = sentenceAdapter

    }
}