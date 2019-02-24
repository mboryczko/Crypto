package pl.michalboryczko.exercise

import android.arch.core.executor.testing.InstantTaskExecutorRule
import org.junit.Rule
import org.mockito.Mockito
import org.mockito.stubbing.OngoingStubbing
import pl.michalboryczko.exercise.model.CryptocurrencyPairDetails
import pl.michalboryczko.exercise.model.CryptocurrencyPairSimple
import pl.michalboryczko.exercise.model.api.CryptocurrencyResponse
import pl.michalboryczko.exercise.model.api.CurrencyPairResponse
import pl.michalboryczko.exercise.model.api.CurrencyTickerResponse
import pl.michalboryczko.exercise.model.api.Params

open class BaseTest {
    @Rule
    @JvmField
    val rule = InstantTaskExecutorRule()

    protected val btcUrl = "https://raw.githubusercontent.com/atomiclabs/cryptocurrency-icons/master/128/color/btc.png"
    protected val ethUrl = "https://raw.githubusercontent.com/atomiclabs/cryptocurrency-icons/master/128/color/eth.png"
    protected val pairDetails = CryptocurrencyPairDetails("BTCETH", "23:26:25", "BTC", "ETH", 0.050043, 0.050043,
            0.050043, "0.050043 ETH", 0.050043)
    protected val pairResponseMock = CurrencyPairResponse("123", "BTC", "ETH", "0.001", "0.001",
            "0.001", "0.001",  "ETH")
    protected val tickerResponseMock = CurrencyTickerResponse(0.050043, 0.050043, 0.050043, 0.050043, 0.050043, 0.050043,
            23525235235.0, 23525235235.0, "2019-02-23T23:26:25.664Z", "BTCETH")

    protected val cryptocurrencyResponse = CryptocurrencyResponse("", "",
            Params(0.050043, 0.050043, 0.050043, 0.050043, 0.050043, 0.050043, 0.050043, 0.050043, "2019-02-23T23:26:25.664Z", "BTCETH"))

    protected val simpleBtcEthPair = CryptocurrencyPairSimple("BTC", "ETH")


    inline fun <reified T> mock() = Mockito.mock(T::class.java)
    inline fun <T> whenever(methodCall: T) : OngoingStubbing<T> =
            Mockito.`when`(methodCall)
}