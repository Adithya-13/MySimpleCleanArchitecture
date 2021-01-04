package com.extcode.project.mysimplecleanarchitecture.data.repository

import com.extcode.project.mysimplecleanarchitecture.data.IMessageDataSource
import com.extcode.project.mysimplecleanarchitecture.domain.repository.IMessageRepository
import com.extcode.project.mysimplecleanarchitecture.domain.model.MessageEntity

class MessageRepository(private val messageDataSource: IMessageDataSource) : IMessageRepository {
    override fun getWelcomeMessage(name: String): MessageEntity {
        return messageDataSource.getMessageFromSource(name)
    }
}