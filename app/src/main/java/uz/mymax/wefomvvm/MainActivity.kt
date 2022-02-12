package uz.mymax.wefomvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint


//If you annotate an Android class with @AndroidEntryPoint,
//then you also must annotate Android classes that depend on it.
//For example, if you annotate a fragment, then you must also
//annotate any activities where you use that fragment.

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}