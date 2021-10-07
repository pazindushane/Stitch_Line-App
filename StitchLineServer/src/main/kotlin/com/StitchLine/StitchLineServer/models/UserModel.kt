package com.StitchLine.StitchLineServer.models

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class UserModel(
        @Id
        var _id: ObjectId? = null,
        var name: String,
        var email: String,
        var mobile: String,
        var username: String,
        var password: String
)
