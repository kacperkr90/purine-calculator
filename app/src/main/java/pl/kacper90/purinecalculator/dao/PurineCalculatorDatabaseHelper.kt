package pl.kacper90.purinecalculator.dao

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class PurineCalculatorDatabaseHelper(context: Context) : SQLiteOpenHelper(
        context,
        DATABASE_NAME,
        null,
        DATABASE_VERSION) {

    companion object {
        val DATABASE_NAME = "purine_calculator.db"
        val DATABASE_VERSION = 1
    }

    override fun onCreate(database: SQLiteDatabase) {

    }

    override fun onUpgrade(database: SQLiteDatabase, i: Int, i1: Int) {

    }
}
