package com.sirius.test_app.data.repository

import com.sirius.test_app.data.repository.mock.dataTestModel
import com.sirius.test_app.domain.entity.DataModel
import com.sirius.test_app.domain.repository.GameRepository

class GameRepositoryImpl : GameRepository {

    override fun getData(): DataModel {
        return dataTestModel
    }
}