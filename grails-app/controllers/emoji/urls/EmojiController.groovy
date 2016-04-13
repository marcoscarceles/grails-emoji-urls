package emoji.urls

class EmojiController {

    def index(String emoji, String id) {
        render text: "${emoji} ${id}!"
    }

    def "❤"(String id) {
        render text: "❤ ${id}!"
    }
}
