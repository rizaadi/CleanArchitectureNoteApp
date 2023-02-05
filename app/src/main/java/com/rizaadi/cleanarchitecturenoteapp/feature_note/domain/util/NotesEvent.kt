package com.rizaadi.cleanarchitecturenoteapp.feature_note.domain.util

import com.rizaadi.cleanarchitecturenoteapp.feature_note.domain.model.Note

sealed class NotesEvent{
    data class Order(val noteOrder: NoteOrder): NotesEvent()
    data class DeleteNote(val note: Note) : NotesEvent()
    object RestoreNote: NotesEvent()
    object ToggleOrderSection: NotesEvent()
}
