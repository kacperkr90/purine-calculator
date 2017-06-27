package pl.kacper90.purinecalculator.di

import android.app.Application
import android.arch.persistence.room.Room
import dagger.Module
import pl.kacper90.purinecalculator.db.PurineCalculatorDatabase

@Module
class AppModule {
    fun provideDatabase(app : Application): PurineCalculatorDatabase {
        return Room.databaseBuilder(app, PurineCalculatorDatabase::class.java, "purineCalculator.db")
                .build()
    }

}