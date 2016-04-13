package emoji.urls

import groovy.transform.CompileStatic

import java.nio.charset.StandardCharsets

/**
 * Created by @marcos-carceles on 13/04/2016.
 */
@CompileStatic
enum Emoji {

    heart([0xE2, 0x9D, 0xA4]),
    man([0xF0, 0x9F, 0x91, 0xA8]),
    necktie([0xF0, 0x9F, 0x91, 0x94]),
    sparkling_heart([0xF0, 0x9F, 0x92, 0x96]),
    stuck_out_tongue_winking_eye([0xF0, 0x9F, 0x98, 0x9C]),
    trade_mark_sign(0xE2, 0x84, 0xA2),
    woman([0xF0, 0x9F, 0x91, 0xA9]),
    womans_clothes([0xF0, 0x9F, 0x91, 0x9A])

    private String replacement

    Emoji(Integer ... replacement) {
        this.replacement = new String(replacement as byte[], StandardCharsets.UTF_8)

    }
    Emoji(List<Integer> replacement) {
        this(replacement as Integer[])
    }

    public String toString() {
        return replacement
    }

    public asType(Class clazz) {
        switch(clazz) {
            case String: return toString()
            default: return super.asType(clazz)
        }
    }
}
