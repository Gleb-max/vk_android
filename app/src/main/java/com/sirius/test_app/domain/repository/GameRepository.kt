package com.sirius.test_app.domain.repository

import com.sirius.test_app.domain.entity.DataModel

interface GameRepository {

    fun getData(): DataModel
}