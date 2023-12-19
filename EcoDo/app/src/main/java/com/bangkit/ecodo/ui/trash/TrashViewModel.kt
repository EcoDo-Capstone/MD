package com.bangkit.ecodo.ui.trash

import androidx.lifecycle.ViewModel
import com.bangkit.ecodo.data.repository.TrashRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class TrashViewModel @Inject constructor(
    private val trashRepository: TrashRepository,
) : ViewModel() {

    fun getHistory() = trashRepository.getTrashHistory()
}