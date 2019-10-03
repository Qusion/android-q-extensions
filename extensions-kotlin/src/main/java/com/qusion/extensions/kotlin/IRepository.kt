package com.qusion.extensions.kotlin

import com.qusion.extensions.kotlin.network.NetworkResult

interface IRepository<Entity: Any> {
    suspend fun fetch(): NetworkResult<Entity>

    suspend fun loadFromDb(): Entity?

    suspend fun writeToDb(entity: Entity)
}
