package pl.michalboryczko.exercise.di.modules

import dagger.Module
import dagger.Provides
import pl.michalboryczko.exercise.source.CryptocurrencyMapper
import pl.michalboryczko.exercise.source.PriceStatusChecker
import pl.michalboryczko.exercise.source.api.rest.RestApiService
import pl.michalboryczko.exercise.source.api.InternetConnectivityChecker
import pl.michalboryczko.exercise.source.api.websocket.WebSocketApiService
import pl.michalboryczko.exercise.source.repository.*


@Module
class InteractorModule {

    @Provides
    fun provideCryptocurrencyMapper(): CryptocurrencyMapper {
        return CryptocurrencyMapper()
    }

    @Provides
    fun providePriceStatusChecker(): PriceStatusChecker {
        return PriceStatusChecker()
    }


    @Provides
    fun provideCryptocurrencyRepository(restApi: RestApiService, webSocketApiService: WebSocketApiService,
                                        checker: InternetConnectivityChecker, mapper: CryptocurrencyMapper): CryptocurrencyRepository {
        return CryptocurrencyRepositoryImpl(restApi, webSocketApiService, mapper, checker)
    }

}