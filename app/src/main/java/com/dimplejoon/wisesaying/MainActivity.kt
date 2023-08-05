package com.dimplejoon.wisesaying

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.dimplejoon.wisesaying.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.showAllSentenceBtn.setOnClickListener{

            val intent = Intent(this, SentenceActivity::class.java)
            startActivity(intent)

        }
        binding.wiseSayingArea.setText(sentenceList.random())
    }
}