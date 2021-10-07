package com.StitchLine.StitchLineServer.repositories

import com.StitchLine.StitchLineServer.models.UserModel
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepo :MongoRepository<UserModel, String> {
    fun findByLastname(username: String?): List<UserModel?>?
}