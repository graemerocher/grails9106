class UrlMappings {

    static mappings = {
        "/user/password"(controller: 'user', action:'updatePassword', method: 'PUT')
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
