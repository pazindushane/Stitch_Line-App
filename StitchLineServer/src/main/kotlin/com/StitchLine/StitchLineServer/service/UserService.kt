package com.StitchLine.StitchLineServer.service

import com.StitchLine.StitchLineServer.models.UserModel
import com.StitchLine.StitchLineServer.repositories.UserRepo
import com.StitchLine.StitchLineServer.request.UserRequest
import com.codersee.mongocrud.exception.NotFoundException
import org.apache.tomcat.jni.User.username
import org.springframework.stereotype.Service

@Service
class UserService(
        private val userRepository: UserRepo
) {
    fun createUser(request: UserRequest): UserModel =
            userRepository.save(
                    UserModel(
                            username = request.username,
                            name = request.name,
                            email = request.email,
                            mobile = request.mobile,
                            password = request.password

                    )
            )

    fun findById():

            List<UserModel>  = userRepository.findAll()
        for (  emp:Employee? in list)
        {
        if (emp.getFirstName().equalsIgnoreCase(firstName)) employees.add(emp)
         }
    return employees
                    .orElseThrow{ NotFoundException("Employee with id $username not found") }

    fun findAll(): List<UserModel> =
            userRepository.findAll()
}