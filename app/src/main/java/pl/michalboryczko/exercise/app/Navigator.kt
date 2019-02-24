package pl.michalboryczko.exercise.app

import android.app.Activity
import pl.michalboryczko.exercise.model.CryptocurrencyPairSimple
import pl.michalboryczko.exercise.ui.details.CryptocurrencyDetailsActivity
import javax.inject.Singleton

@Singleton
class Navigator {
    fun navigateToCryptocurrencyDetailsActivity(activity: Activity, pair: CryptocurrencyPairSimple)
            = activity.apply { startActivity(CryptocurrencyDetailsActivity.prepareIntent(activity, pair)) }
}