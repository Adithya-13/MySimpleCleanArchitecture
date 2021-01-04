package com.extcode.project.mysimplecleanarchitecture.domain.repository

import com.extcode.project.mysimplecleanarchitecture.domain.model.MessageEntity

interface IMessageRepository {
    fun getWelcomeMessage(name: String): MessageEntity
}