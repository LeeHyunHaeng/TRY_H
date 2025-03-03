package com.yjk.atry.db.repository

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.yjk.atry.db.AppDatabase

class DatabaseHelper {

    companion object {

        var database: RoomDatabase.Builder<AppDatabase>? = null

        fun getDatabase(context: Context) : RoomDatabase.Builder<AppDatabase>{

            if (database == null) {
                database = Room.databaseBuilder(
                    context,
                    AppDatabase::class.java,
                    "try_db"
                )
            }

            return database!!
        }
    }

}