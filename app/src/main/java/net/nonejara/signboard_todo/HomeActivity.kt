package net.nonejara.signboard_todo

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_home.*
import net.nonejara.signboard_todo.R.layout.activity_home

class HomeActivity : AppCompatActivity() {
    lateinit private var text1 : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_home)
        text1 = findViewById(R.id.textView1)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener(View.OnClickListener { doSomething() })

    }

    private fun doSomething(){
        text1.text = "hello"
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        when(event.getAction()){
            MotionEvent.ACTION_DOWN ->
                    text1.text = "1 is clicked"
            MotionEvent.ACTION_MOVE ->
                    text1.setTextColor(Color.CYAN)
        }
        return true
    }


}
