package com.primandika.praktikum9

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

//menjadi entitas kelas data word mewakili tabel sqllite

@Entity(tableName = "word_table")
data class Word(@PrimaryKey @ColumnInfo(name = "word") val word: String)