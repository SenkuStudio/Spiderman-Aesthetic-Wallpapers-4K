package com.walli.spidermanaesthetic.domain.usecase

import com.walli.spidermanaesthetic.domain.repository.LibraryRepository
import javax.inject.Inject

class ObserveRecentsUseCase @Inject constructor(
    private val repository: LibraryRepository,
) {
    operator fun invoke() = repository.observeRecents()
}
