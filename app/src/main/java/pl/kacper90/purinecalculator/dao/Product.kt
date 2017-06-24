package pl.kacper90.purinecalculator.dao

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
class Product(@PrimaryKey val id: Long?,
              @ColumnInfo(name = "name") val name: String,
              @ColumnInfo(name = "purine_acid_value") val purineAcidValue: Long) {

    constructor(name: String, purineAcidValue: Long) : this(null, name, purineAcidValue)

}