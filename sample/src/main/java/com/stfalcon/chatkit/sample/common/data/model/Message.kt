package com.stfalcon.chatkit.sample.common.data.model

import com.stfalcon.chatkit.commons.models.IMessage
import com.stfalcon.chatkit.commons.models.MessageContentType
import java.util.*

/*
 * Created by troy379 on 04.04.17.
 */
class Message @JvmOverloads constructor(
        override val id: String,
        override val user: User,
        override var text: String?,
        override var createdAt: Date = Date()) : IMessage, MessageContentType.Image, MessageContentType /*and this one is for custom content type (in this case - voice message)*/ {
    private var image: Image? = null
    var voice: Voice? = null

    override fun getImageUrl(): String? {
        return if (image == null) null else image!!.url
    }

    val status: String
        get() = "Sent"

    fun setImage(image: Image?) {
        this.image = image
    }

    class Image(val url: String)

    class Voice(val url: String, val duration: Int)

}