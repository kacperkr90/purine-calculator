package pl.kacper90.purinecalculator.entity

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
class Product(
        @PrimaryKey(autoGenerate = false ) val id: Long?,
        @ColumnInfo(name = "name") val name: String,
        @ColumnInfo(name = "purine_acid_value") val purineAcidValue: Long
)