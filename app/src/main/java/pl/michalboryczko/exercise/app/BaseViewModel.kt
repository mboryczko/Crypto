package pl.michalboryczko.exercise.app

import android.arch.lifecycle.LifecycleObserver
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import io.reactivex.disposables.Disposable

abstract class BaseViewModel: ViewModel(), LifecycleObserver {


    /*val toastInfo: MutableLiveData<String> = MutableLiveData()*/

    /*
    abstract fun onStop()
    abstract fun onResume()*/


}
