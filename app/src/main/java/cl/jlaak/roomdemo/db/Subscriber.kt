package cl.jlaak.roomdemo.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "subscriber_data_table")
data class Subscriber(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "subscribe_id")
    val id: Int,
    @ColumnInfo(name = "subscribe_name")
    val name: String,
    @ColumnInfo(name = "subscribe_email")
    val email: String
) {
}