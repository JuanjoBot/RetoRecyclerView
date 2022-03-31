package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recyclerview.databinding.ActivityMainBinding
import org.json.JSONObject

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fakeVideoData: Array<JSONObject> = arrayOf(
            JSONObject("{\"likes\": \"525 likes\", \"comments\": \"10 comments\", \"shares\": \"20 shares\"}"),
            JSONObject("{\"likes\": \"12 likes\", \"comments\": \"1 comments\", \"shares\": \"6 shares\"}"),
            JSONObject("{\"likes\": \"30 likes\", \"comments\": \"20 comments\", \"shares\": \"7 shares\"}"),
            JSONObject("{\"likes\": \"100 likes\", \"comments\": \"30 comments\", \"shares\": \"8 shares\"}"),
            JSONObject("{\"likes\": \"1000 likes\", \"comments\": \"200 comments\", \"shares\": \"125 shares\"}")
        )

        binding.rwVideosEntries.adapter = MainAdapter(fakeVideoData)
    }
}