package com.rizaadi.cleanarchitecturenoteapp.feature_note.domain.use_case

import com.rizaadi.cleanarchitecturenoteapp.feature_note.domain.model.Note
import com.rizaadi.cleanarchitecturenoteapp.feature_note.domain.repository.NoteRepository

class GetNote(
    val repository: NoteRepository
) {
    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}