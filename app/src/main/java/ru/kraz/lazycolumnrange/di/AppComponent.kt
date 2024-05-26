package ru.kraz.lazycolumnrange.di

import dagger.Component
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import ru.kraz.lazycolumnrange.data.NotesRepositoryImpl
import ru.kraz.lazycolumnrange.domain.NotesRepository
import javax.inject.Singleton

@Component(modules = [AppModule::class])
@Singleton
interface AppComponent

@Module(includes = [DatabaseModule::class])
@InstallIn(SingletonComponent::class)
class AppModule {
    @Provides
    fun provideCoroutineDispatcher(): CoroutineDispatcher = Dispatchers.IO
}