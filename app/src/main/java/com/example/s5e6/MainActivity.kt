package com.example.s5e6
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragment = DictionaireFragment()
        goToFragment(fragment, true)

        val detailFragment = DetailFragment()

        fragment.setOnFragmentListener(FragmentListener() {
            goToFragment(detailFragment.getNewInstance(it), false)
        })

    }


    private fun goToFragment(Frag: Fragment, isTop: Boolean){
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragment_container, Frag)
            if (!isTop)
                addToBackStack(null)
            commit()
        }
    }
}