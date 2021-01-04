package com.extcode.project.mysimplecleanarchitecture.domain.usecase

import com.extcode.project.mysimplecleanarchitecture.domain.model.MessageEntity
import com.extcode.project.mysimplecleanarchitecture.domain.repository.IMessageRepository

class MessageInteractor(private val messageRepository: IMessageRepository) : MessageUseCase {
    override fun getMessage(name: String): MessageEntity {
        return messageRepository.getWelcomeMessage(name)
    }
}