package com.extcode.project.mysimplecleanarchitecture.domain.usecase

import com.extcode.project.mysimplecleanarchitecture.domain.model.MessageEntity

interface MessageUseCase {
    fun getMessage(name: String): MessageEntity
}