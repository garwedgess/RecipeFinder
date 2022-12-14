package eu.wedgess.recipefinder.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import eu.wedgess.recipefinder.data.mappers.AvailableIngredientResponseMapper
import eu.wedgess.recipefinder.data.mappers.RecipeMapper
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class MapperModule {

    @Provides
    @Singleton
    fun provideAvailableIngredientResponseMapper(): AvailableIngredientResponseMapper {
        return AvailableIngredientResponseMapper()
    }

    @Provides
    @Singleton
    fun provideRecipeMapper(): RecipeMapper {
        return RecipeMapper()
    }
}