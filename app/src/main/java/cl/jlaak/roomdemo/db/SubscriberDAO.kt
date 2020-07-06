package cl.jlaak.roomdemo.db

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface SubscriberDAO {
    @Insert
    suspend fun insertSubscriberSuspend(subscriber: Subscriber): Long

    @Update
    suspend fun updateSubscriber(subscriber: Subscriber)

    @Delete
    suspend fun deleteSubscribe(subscriber: Subscriber)

    @Query("DELETE FROM subscriber_data_table")
    suspend fun deleteAllSubscribers()

    @Query(" SELECT * FROM subscriber_data_table")
    fun getAllSubscribers():LiveData<List<Subscriber>>

    @Insert
    fun insertSubscriberNormal(subscriber: Subscriber): Long

    @Insert
    fun insertSubscrbers(
        subscriber1: Subscriber,
        subscriber2: Subscriber,
        subscriber3: Subscriber
    ): List<Long>

    @Insert
    fun insertSubscribers(subscribers: List<Subscriber>): List<Long>

    @Insert
    fun insertSubcribersCombine(subscriber: Subscriber, subscribers: List<Subscriber>): List<Long>

}