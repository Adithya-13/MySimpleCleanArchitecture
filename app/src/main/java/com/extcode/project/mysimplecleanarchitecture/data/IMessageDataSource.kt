package com.extcode.project.mysimplecleanarchitecture.data

import com.extcode.project.mysimplecleanarchitecture.domain.model.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}