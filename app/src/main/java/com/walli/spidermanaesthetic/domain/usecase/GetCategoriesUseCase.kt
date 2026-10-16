package com.walli.spidermanaesthetic.domain.usecase

import com.walli.spidermanaesthetic.domain.repository.WallpaperRepository
import javax.inject.Inject

class GetCategoriesUseCase @Inject constructor(
    private val repository: WallpaperRepository,
) {
    suspend operator fun invoke() = repository.getCategories()
}
