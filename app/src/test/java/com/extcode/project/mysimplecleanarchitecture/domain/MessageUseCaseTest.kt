package com.extcode.project.mysimplecleanarchitecture.domain

import com.extcode.project.mysimplecleanarchitecture.domain.model.MessageEntity
import com.extcode.project.mysimplecleanarchitecture.domain.repository.IMessageRepository
import com.extcode.project.mysimplecleanarchitecture.domain.usecase.MessageInteractor
import com.extcode.project.mysimplecleanarchitecture.domain.usecase.MessageUseCase
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.*
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class MessageUseCaseTest {

    private lateinit var messageUseCase: MessageUseCase

    @Mock
    private lateinit var messageRepository: IMessageRepository

    @Before
    fun setUp() {
        messageUseCase = MessageInteractor(messageRepository)
        val dummyMessage = MessageEntity("Hello $NAME Welcome to Clean Architecture")
        `when`(messageRepository.getWelcomeMessage(NAME)).thenReturn(dummyMessage)
    }

    @Test
    fun `should get data from repository`() {
        messageUseCase.getMessage(NAME)

        verify(messageRepository).getWelcomeMessage(NAME)
        verifyNoMoreInteractions(messageRepository)
    }

    companion object {
        const val NAME = "Dicoding"
    }
}