package com.varunbarad.takehome.notes.screens.create_note

data class CreateNoteViewState(
    val titleValue: String,
    val contentsValue: String,
    val titleErrorText: String,
    val contentsErrorText: String,
    val showTitleError: Boolean,
    val showContentsError: Boolean
)
