package com.StitchLine.StitchLineServer.controllers

import com.StitchLine.StitchLineServer.request.UserRequest
import com.StitchLine.StitchLineServer.response.UserResponse
import com.StitchLine.StitchLineServer.service.UserService
import org.bson.types.ObjectId
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import javax.servlet.http.HttpServletResponse

@RestController
//@CrossOrigin(origins = "http://localhost:8080")
@CrossOrigin(origins = arrayOf("http://localhost:8080", "http://localhost:63342"))
//@CrossOrigin(origins = arrayOf("http://localhost:4200"))
@RequestMapping("/api/user")
class UserController(
        private val userService: UserService
) {

    @PostMapping("/saveuser")
    fun createCompany(@RequestBody request: UserRequest): ResponseEntity<UserResponse> {
        val createdUser = userService.createUser(request)

        return ResponseEntity
                .ok(
                        UserResponse.fromEntity(createdUser)
                )
    }


    @GetMapping("/getuser/{username}")
    fun findCompanyById(@PathVariable username: String): ResponseEntity<UserResponse> {
        val company = userService.findById(username)

        return ResponseEntity
                .ok(
                        UserResponse.fromEntity(company)
                )
    }

    @GetMapping
    fun findAllCompanies(): ResponseEntity<List<UserResponse>> {
        val companies = userService.findAll()

        return ResponseEntity
                .ok(
                        companies.map { UserResponse.fromEntity(it) }
                )
    }


}