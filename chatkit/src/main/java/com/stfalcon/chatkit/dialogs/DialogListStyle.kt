/*******************************************************************************
 * Copyright 2016 stfalcon.com
 *
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.stfalcon.chatkit.dialogs

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import com.stfalcon.chatkit.R
import com.stfalcon.chatkit.commons.Style

/**
 * Style for DialogList customization by xml attributes
 */
internal class DialogListStyle private constructor(context: Context, attrs: AttributeSet) : Style(context, attrs) {
    var dialogTitleTextColor = 0
        private set
    var dialogTitleTextSize = 0
        private set
    var dialogTitleTextStyle = 0
        private set
    var dialogUnreadTitleTextColor = 0
        private set
    var dialogUnreadTitleTextStyle = 0
        private set
    var dialogMessageTextColor = 0
        private set
    var dialogMessageTextSize = 0
        private set
    var dialogMessageTextStyle = 0
        private set
    var dialogUnreadMessageTextColor = 0
        private set
    var dialogUnreadMessageTextStyle = 0
        private set
    var dialogDateColor = 0
        private set
    var dialogDateSize = 0
        private set
    var dialogDateStyle = 0
        private set
    var dialogUnreadDateColor = 0
        private set
    var dialogUnreadDateStyle = 0
        private set
    var isDialogUnreadBubbleEnabled = false
        private set
    var dialogUnreadBubbleTextColor = 0
        private set
    var dialogUnreadBubbleTextSize = 0
        private set
    var dialogUnreadBubbleTextStyle = 0
        private set
    var dialogUnreadBubbleBackgroundColor = 0
        private set
    var dialogAvatarWidth = 0
        private set
    var dialogAvatarHeight = 0
        private set
    var isDialogMessageAvatarEnabled = false
        private set
    var dialogMessageAvatarWidth = 0
        private set
    var dialogMessageAvatarHeight = 0
        private set
    var isDialogDividerEnabled = false
        private set
    var dialogDividerColor = 0
        private set
    var dialogDividerLeftPadding = 0
        private set
    var dialogDividerRightPadding = 0
        private set
    var dialogItemBackground = 0
        private set
    var dialogUnreadItemBackground = 0
        private set

    companion object {
        @JvmStatic
        fun parse(context: Context, attrs: AttributeSet): DialogListStyle {
            val style = DialogListStyle(context, attrs)
            val typedArray = context.obtainStyledAttributes(attrs, R.styleable.DialogsList)

            //Item background
            style.dialogItemBackground = typedArray.getColor(R.styleable.DialogsList_dialogItemBackground,
                    style.getColor(R.color.transparent))
            style.dialogUnreadItemBackground = typedArray.getColor(R.styleable.DialogsList_dialogUnreadItemBackground,
                    style.getColor(R.color.transparent))

            //Title text
            style.dialogTitleTextColor = typedArray.getColor(R.styleable.DialogsList_dialogTitleTextColor,
                    style.getColor(R.color.dialog_title_text))
            style.dialogTitleTextSize = typedArray.getDimensionPixelSize(R.styleable.DialogsList_dialogTitleTextSize,
                    context.resources.getDimensionPixelSize(R.dimen.dialog_title_text_size))
            style.dialogTitleTextStyle = typedArray.getInt(R.styleable.DialogsList_dialogTitleTextStyle, Typeface.NORMAL)

            //Title unread text
            style.dialogUnreadTitleTextColor = typedArray.getColor(R.styleable.DialogsList_dialogUnreadTitleTextColor,
                    style.getColor(R.color.dialog_title_text))
            style.dialogUnreadTitleTextStyle = typedArray.getInt(R.styleable.DialogsList_dialogUnreadTitleTextStyle, Typeface.NORMAL)

            //Message text
            style.dialogMessageTextColor = typedArray.getColor(R.styleable.DialogsList_dialogMessageTextColor,
                    style.getColor(R.color.dialog_message_text))
            style.dialogMessageTextSize = typedArray.getDimensionPixelSize(R.styleable.DialogsList_dialogMessageTextSize,
                    context.resources.getDimensionPixelSize(R.dimen.dialog_message_text_size))
            style.dialogMessageTextStyle = typedArray.getInt(R.styleable.DialogsList_dialogMessageTextStyle, Typeface.NORMAL)

            //Message unread text
            style.dialogUnreadMessageTextColor = typedArray.getColor(R.styleable.DialogsList_dialogUnreadMessageTextColor,
                    style.getColor(R.color.dialog_message_text))
            style.dialogUnreadMessageTextStyle = typedArray.getInt(R.styleable.DialogsList_dialogUnreadMessageTextStyle, Typeface.NORMAL)

            //Date text
            style.dialogDateColor = typedArray.getColor(R.styleable.DialogsList_dialogDateColor,
                    style.getColor(R.color.dialog_date_text))
            style.dialogDateSize = typedArray.getDimensionPixelSize(R.styleable.DialogsList_dialogDateSize,
                    context.resources.getDimensionPixelSize(R.dimen.dialog_date_text_size))
            style.dialogDateStyle = typedArray.getInt(R.styleable.DialogsList_dialogDateStyle, Typeface.NORMAL)

            //Date unread text
            style.dialogUnreadDateColor = typedArray.getColor(R.styleable.DialogsList_dialogUnreadDateColor,
                    style.getColor(R.color.dialog_date_text))
            style.dialogUnreadDateStyle = typedArray.getInt(R.styleable.DialogsList_dialogUnreadDateStyle, Typeface.NORMAL)

            //Unread bubble
            style.isDialogUnreadBubbleEnabled = typedArray.getBoolean(R.styleable.DialogsList_dialogUnreadBubbleEnabled, true)
            style.dialogUnreadBubbleBackgroundColor = typedArray.getColor(R.styleable.DialogsList_dialogUnreadBubbleBackgroundColor,
                    style.getColor(R.color.dialog_unread_bubble))

            //Unread bubble text
            style.dialogUnreadBubbleTextColor = typedArray.getColor(R.styleable.DialogsList_dialogUnreadBubbleTextColor,
                    style.getColor(R.color.dialog_unread_text))
            style.dialogUnreadBubbleTextSize = typedArray.getDimensionPixelSize(R.styleable.DialogsList_dialogUnreadBubbleTextSize,
                    context.resources.getDimensionPixelSize(R.dimen.dialog_unread_bubble_text_size))
            style.dialogUnreadBubbleTextStyle = typedArray.getInt(R.styleable.DialogsList_dialogUnreadBubbleTextStyle, Typeface.NORMAL)

            //Avatar
            style.dialogAvatarWidth = typedArray.getDimensionPixelSize(R.styleable.DialogsList_dialogAvatarWidth,
                    context.resources.getDimensionPixelSize(R.dimen.dialog_avatar_width))
            style.dialogAvatarHeight = typedArray.getDimensionPixelSize(R.styleable.DialogsList_dialogAvatarHeight,
                    context.resources.getDimensionPixelSize(R.dimen.dialog_avatar_height))

            //Last message avatar
            style.isDialogMessageAvatarEnabled = typedArray.getBoolean(R.styleable.DialogsList_dialogMessageAvatarEnabled, true)
            style.dialogMessageAvatarWidth = typedArray.getDimensionPixelSize(R.styleable.DialogsList_dialogMessageAvatarWidth,
                    context.resources.getDimensionPixelSize(R.dimen.dialog_last_message_avatar_width))
            style.dialogMessageAvatarHeight = typedArray.getDimensionPixelSize(R.styleable.DialogsList_dialogMessageAvatarHeight,
                    context.resources.getDimensionPixelSize(R.dimen.dialog_last_message_avatar_height))

            //Divider
            style.isDialogDividerEnabled = typedArray.getBoolean(R.styleable.DialogsList_dialogDividerEnabled, true)
            style.dialogDividerColor = typedArray.getColor(R.styleable.DialogsList_dialogDividerColor, style.getColor(R.color.dialog_divider))
            style.dialogDividerLeftPadding = typedArray.getDimensionPixelSize(R.styleable.DialogsList_dialogDividerLeftPadding,
                    context.resources.getDimensionPixelSize(R.dimen.dialog_divider_margin_left))
            style.dialogDividerRightPadding = typedArray.getDimensionPixelSize(R.styleable.DialogsList_dialogDividerRightPadding,
                    context.resources.getDimensionPixelSize(R.dimen.dialog_divider_margin_right))
            typedArray.recycle()
            return style
        }
    }
}