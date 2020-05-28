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

import java.util.*

/**
 * For implementing by real message model
 */
interface IMessage {
    /**
     * Returns message identifier
     *
     * @return the message id
     */
    val id: String?

    /**
     * Returns message text
     *
     * @return the message text
     */
    val text: String?

    /**
     * Returns message author. See the [IUser] for more details
     *
     * @return the message author
     */
    val user: IUser?

    /**
     * Returns message creation date
     *
     * @return the message creation date
     */
    val createdAt: Date?
}