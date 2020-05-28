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
package com.stfalcon.chatkit.commons.models

/**
 * For implementing by real dialog model
 */
interface IDialog<MESSAGE : IMessage> {
    val id: String?
    val dialogPhoto: String?
    val dialogName: String?
    val users: List<IUser?>?
    var lastMessage: IMessage
    val unreadCount: Int
}