package com.extcode.project.mysimplecleanarchitecture.di

import com.extcode.project.mysimplecleanarchitecture.data.IMessageDataSource
import com.extcode.project.mysimplecleanarchitecture.data.MessageDataSource
import com.extcode.project.mysimplecleanarchitecture.data.repository.MessageRepository
import com.extcode.project.mysimplecleanarchitecture.domain.repository.IMessageRepository
import com.extcode.project.mysimplecleanarchitecture.domain.usecase.MessageInteractor
import com.extcode.project.mysimplecleanarchitecture.domain.usecase.MessageUseCase

object Injection {
    fun provideUseCase() : MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource() : IMessageDataSource {
        return MessageDataSource()
    }
}