package com.dontsu.screenlotateex

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("TEST", "Activity onCreate()")

    }

    //버튼 클릭시 번들데이터를 가진 프래그먼트가 생성됨.
    fun startFragment(view: View) {
        text.text = editText.text.toString()
        val bundle = Bundle()
        Log.d("TEST", "send Bundle from Activity")
        bundle.putString("key", editText.text.toString())
        val fragment = TestFragment()
        fragment.arguments = bundle
        supportFragmentManager.beginTransaction().replace(R.id.frameLayout, fragment).commit()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
    }

    override fun onPause() {
        super.onPause()
        Log.d("TEST", "Activity onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.d("TEST", "Activity onStop()")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d("TEST", "Activity onSaveInstanceState()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("TEST", "Activity onDestroy()")
    }

}
