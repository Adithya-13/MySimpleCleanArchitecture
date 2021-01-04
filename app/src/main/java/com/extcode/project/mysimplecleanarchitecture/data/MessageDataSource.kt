package com.extcode.project.mysimplecleanarchitecture.data

import com.extcode.project.mysimplecleanarchitecture.domain.model.MessageEntity

class MessageDataSource : IMessageDataSource {
    override fun getMessageFromSource(name: String): MessageEntity {
        return MessageEntity("Hello $name, Welcome to Clean Architecture")
    }
}