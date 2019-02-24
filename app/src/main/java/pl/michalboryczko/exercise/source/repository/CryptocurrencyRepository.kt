package pl.michalboryczko.exercise.source.repository

import io.reactivex.Flowable
import io.reactivex.Single
import pl.michalboryczko.exercise.model.CryptocurrencyPairDetails
import pl.michalboryczko.exercise.model.CryptocurrencyPair
import pl.michalboryczko.exercise.model.CryptocurrencyPairSimple

interface CryptocurrencyRepository {
    fun getCryptocurrencyPairs() : Single<List<CryptocurrencyPair>>
    fun getCryptocurrencyDetails(cryptoPair: CryptocurrencyPairSimple) : Flowable<CryptocurrencyPairDetails>
}