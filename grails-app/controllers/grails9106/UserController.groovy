package grails9106

class UserController {

    def updatePassword(String oldPassword, String password) {
        // The two parameters are null
        println "OLD: $oldPassword NEW: $password"
        render(status: 200)
    }
}
