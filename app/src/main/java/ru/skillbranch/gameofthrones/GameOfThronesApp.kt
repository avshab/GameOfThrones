package ru.skillbranch.gameofthrones

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.core.context.startKoin
import org.koin.dsl.module
import ru.skillbranch.gameofthrones.database.DatabaseModule
import ru.skillbranch.gameofthrones.repositories.RootRepository
import ru.skillbranch.gameofthrones.ui.character_screen.CharacterScreenViewModel
import ru.skillbranch.gameofthrones.ui.charters_list_screen.ChartersListScreenViewModel
import ru.skillbranch.gameofthrones.ui.splash_screen.SplashScreenViewModel

class GameOfThronesApp : Application() {

    private var appModule = module {
        single { RootRepository }
    }

    private var viewModels = module {
        viewModel { ChartersListScreenViewModel(get()) }
      //  viewModel { SplashScreenViewModel(get()) }
        viewModel { CharacterScreenViewModel(get()) }
    }

    override fun onCreate() {
        super.onCreate()

        DatabaseModule.context = applicationContext

        startKoin {
            androidLogger()
            androidContext(this@GameOfThronesApp)
            modules(
                listOf(
                    appModule,
                    viewModels
                )
            )
        }
    }
}