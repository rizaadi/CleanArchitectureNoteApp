package com.rizaadi.cleanarchitecturenoteapp.feature_note.domain.use_case

import com.rizaadi.cleanarchitecturenoteapp.feature_note.domain.model.InvalidNoteException
import com.rizaadi.cleanarchitecturenoteapp.feature_note.domain.model.Note
import com.rizaadi.cleanarchitecturenoteapp.feature_note.domain.repository.NoteRepository

class AddNote(
    private val repository: NoteRepository
) {
    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if (note.title.isBlank()) {
            throw InvalidNoteException("The title of the note cant be empty")
        }
        if (note.content.isBlank()){
            throw InvalidNoteException("The content of the note cant be empty")
        }
        repository.insertNote(note)
    }
}