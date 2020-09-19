package com.dontsu.screenlotateex

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_test.*

class TestFragment : Fragment() {

    private var text: String? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("TEST", "Fragment onCreate()")
        arguments?.let {
            text = it.getString("key")
            val test_text = savedInstanceState?.getString("key2") ?: "nothing"
            Log.d("TEST", "get Bundle from Activity : $text and $test_text")
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_test, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        frag_text.text = text

        input.setOnClickListener {
            frag_text.text = editTExt2.text.toString()
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("key2", "냥냥시타이")
        Log.d("TEST", "Fragment onSaveInstanceState()")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("TEST", "Fragment onDestroyView()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("TEST", "Fragment onDestroy()")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("TEST", "Fragment onDetach()")
    }

}