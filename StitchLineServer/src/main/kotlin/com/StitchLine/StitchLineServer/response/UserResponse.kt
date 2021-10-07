package com.StitchLine.StitchLineServer.response

import com.StitchLine.StitchLineServer.models.User
import com.StitchLine.StitchLineServer.models.UserModel
import org.bson.types.ObjectId

class UserResponse (
    var _id: String,
    var name: String,
    var email: String,
    var mobile: String,
    var username: String,
    var password: String
){
    companion object {
        fun fromEntity(employee: UserModel): UserResponse =
                UserResponse(

                        _id = employee._id!!.toHexString(),
                        name = employee.name,
                        email = employee.email,
                        mobile = employee.mobile,
                        username = employee.username,
                        password = employee.password

                )
    }
}