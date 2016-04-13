package emoji.urls

class UrlMappings {

    static mappings = {

        "/$emoji/$id${Emoji.trade_mark_sign}" {
            controller = "emoji"
            action = "index"

            constraints {
                //emoji(inList: Emoji.values()*.toString()) //Interesting enough, this does not work
                emoji validator: { it in Emoji.values()*.toString() } //It needs to ve a validator
            }
        }

        "/❤/$id${Emoji.trade_mark_sign}"(controller: 'emoji', action: '❤')

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
