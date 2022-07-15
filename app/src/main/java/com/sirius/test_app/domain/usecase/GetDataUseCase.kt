package com.sirius.test_app.domain.usecase

import com.sirius.test_app.domain.entity.DataModel
import com.sirius.test_app.domain.repository.GameRepository

class GetDataUseCase(private val repository: GameRepository) {

    fun invoke(): DataModel = repository.getData()
}