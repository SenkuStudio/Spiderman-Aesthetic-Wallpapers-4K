package com.walli.spidermanaesthetic.domain.usecase

import com.walli.spidermanaesthetic.domain.model.Wallpaper
import com.walli.spidermanaesthetic.domain.repository.LibraryRepository
import javax.inject.Inject

class SaveRecentWallpaperUseCase @Inject constructor(
    private val repository: LibraryRepository,
) {
    suspend operator fun invoke(wallpaper: Wallpaper) = repository.addRecent(wallpaper)
}
