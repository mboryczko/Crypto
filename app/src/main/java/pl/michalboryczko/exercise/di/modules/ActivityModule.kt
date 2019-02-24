package pl.michalboryczko.exercise.di.modules

import android.arch.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.IntoMap
import pl.michalboryczko.exercise.di.ViewModelKey
import pl.michalboryczko.exercise.ui.pairs.CryptocurrencyPairActivity
import pl.michalboryczko.exercise.ui.pairs.CryptocurrencyPairViewModel
import pl.michalboryczko.exercise.ui.details.CryptocurrencyDetailsActivity
import pl.michalboryczko.exercise.ui.details.CryptocurrencyDetailsViewModel

@Module
internal abstract class ActivityModule {

    @ContributesAndroidInjector
    internal abstract fun cryptocurrencyPairActivity(): CryptocurrencyPairActivity

    @Binds
    @IntoMap
    @ViewModelKey(CryptocurrencyPairViewModel::class)
    abstract fun bindCryptocurrencyPairViewModel(viewModel: CryptocurrencyPairViewModel): ViewModel


    @Binds
    @IntoMap
    @ViewModelKey(CryptocurrencyDetailsViewModel::class)
    abstract fun bindCryptocurrencyDetailsViewModel(viewModel: CryptocurrencyDetailsViewModel): ViewModel

    @ContributesAndroidInjector
    internal abstract fun cryptocurrencyDetailsActivity(): CryptocurrencyDetailsActivity
}