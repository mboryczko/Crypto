package pl.michalboryczko.exercise.app

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.view.View
import android.widget.Toast
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject


abstract class BaseActivity<T: BaseViewModel>  : DaggerAppCompatActivity() {

    @Inject lateinit var  viewModelFactory: ViewModelProvider.Factory

    @Inject
    lateinit var navigator: Navigator


    lateinit var viewModel : T


    inline fun <reified T: BaseViewModel> getGenericViewModel(): T {
        return ViewModelProviders.of(this, viewModelFactory).get(T::class.java)
    }

    fun showToastMessage(msg: String, isLong: Boolean = true){
        Toast.makeText(this, msg,
                if(isLong) Toast.LENGTH_LONG else Toast.LENGTH_SHORT)
                .show()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViewModel()
        lifecycle.addObserver(viewModel)
    }

    abstract fun initViewModel()


    fun hideViews(vararg t: View)
        = t.iterator().forEach { it.visibility = View.GONE }


    fun showViews(vararg  t: View)
        = t.iterator().forEach { it.visibility = View.VISIBLE }

}